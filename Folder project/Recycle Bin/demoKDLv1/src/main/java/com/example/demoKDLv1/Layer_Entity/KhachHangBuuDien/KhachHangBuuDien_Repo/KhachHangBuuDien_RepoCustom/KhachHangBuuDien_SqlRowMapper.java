package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Repo.KhachHangBuuDien_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoJpa.KhachHang_Repo;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;

public class KhachHangBuuDien_SqlRowMapper 
    implements RowMapper<KhachHangBuuDien>
{
    @Autowired
    KhachHang_Repo khachHang_Repo;

    @Override
    public KhachHangBuuDien mapRow
        (ResultSet ketquatrave, int sttHang) 
    {
        try {
            String diachibuudien= ketquatrave.getString("diachibuudien");
            KhachHang kh= khachHang_Repo.findById(ketquatrave.getLong("makh")).get();

            KhachHangBuuDien khbd= new KhachHangBuuDien(kh, diachibuudien);
            return khbd;
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    
}
