package com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoJpa.KhachHang_Repo;

public class DonDatHang_SqlRowMapper implements RowMapper<DonDatHang> {
    
    @Autowired
    KhachHang_Repo khachhang_Repo;

    @Override
    public DonDatHang mapRow (ResultSet ketquatrave, int sttHang) {
        try {
            Long madon= null;
            Timestamp ngaydathang= null;
            KhachHang khachhang= null;

            madon= ketquatrave.getLong("madon");
            ngaydathang= ketquatrave.getTimestamp("ngaydathang");
            khachhang= khachhang_Repo.findById(ketquatrave.getLong("makh")).get();

            DonDatHang ddh1= new DonDatHang(madon, khachhang, ngaydathang);

            return ddh1;
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
