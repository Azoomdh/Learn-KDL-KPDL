package com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;

@Repository
public class KhachHang_RepoCustom {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<KhachHang> getRandomKhachhang(Integer soluong){
        String lenhSql1= 
            "SELECT "
                + " TOP("+ soluong+" ) "
                + " * "
                + " FROM khach_hang "
                + " ORDER BY NEWID()";
        
        return jdbcTemplate.query(lenhSql1, new KhachHang_SqlRowMapper());
    }
}
