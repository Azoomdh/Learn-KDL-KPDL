package com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Repo.VanPhongDaiDien_RepoJpa.VanPhongDaiDien_Repo;

public class KhachHang_SqlRowMapper implements RowMapper<KhachHang>{

    @Autowired
    VanPhongDaiDien_Repo vpdd_Repo;

    @Override
    public KhachHang mapRow(ResultSet hangtrave, int sttHang) {
        try{
            Long makh= null;
            Timestamp ngaydathangdautien= null;
            String tenkh= null;
            VanPhongDaiDien vpdd= null;

            makh= hangtrave.getLong("makh");
            ngaydathangdautien= hangtrave.getTimestamp("ngaydathangdautien");
            tenkh= hangtrave.getString("tenkh");
            vpdd= vpdd_Repo.findById( hangtrave.getLong("matp")).get();

            KhachHang khachhang1= new KhachHang(makh, tenkh, ngaydathangdautien, vpdd);

            return khachhang1;
        }

        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
}
