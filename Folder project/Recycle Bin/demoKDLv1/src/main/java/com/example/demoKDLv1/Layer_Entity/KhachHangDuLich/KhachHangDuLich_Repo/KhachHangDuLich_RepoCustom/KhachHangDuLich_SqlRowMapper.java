package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Repo.KhachHangDuLich_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoJpa.KhachHang_Repo;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;

public class KhachHangDuLich_SqlRowMapper 
    implements RowMapper<KhachHangDuLich> 
{
    @Autowired
    KhachHang_Repo khachhang_Repo;

    @Override
    public KhachHangDuLich mapRow
        (ResultSet ketquatrave, int sttHang)
    {
        try{
            String huongdanviendulich= null;
            KhachHang khachhang= null;

            huongdanviendulich= ketquatrave.getString("huongdanviendulich");
            khachhang= khachhang_Repo.findById( ketquatrave.getLong("makh")).get();

            KhachHangDuLich khdl= new KhachHangDuLich(khachhang, huongdanviendulich);

            return khdl;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    
}
