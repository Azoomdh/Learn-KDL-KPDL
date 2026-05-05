package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Repo.KhachHangBuuDien_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;

@Repository
public class KhachHangBuuDien_RepoCustom {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    public List<KhachHangBuuDien> getRandomKhbd(Long soluong){
        String lenhSql1= 
            "SELECT " 
                + " TOP("+ soluong+ ")"
                + " *"
                + " FROM khach_hang_buu_dien "
                + " ORDER BY NEWID()";

        return jdbcTemplate.query(lenhSql1, new KhachHangBuuDien_SqlRowMapper());
    }
}
