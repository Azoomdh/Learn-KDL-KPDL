package com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;

@Repository
public class DonDatHang_RepoCustom {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    public List<DonDatHang> getRandomDondathang(Integer soluong){
        String lenhSql1=
            "SELECT "
                + " TOP("+ soluong+") "
                + " * "
                + " FROM don_dat_hang "
                + " ORDER BY NEWID() ";
        return jdbcTemplate.query(lenhSql1, new DonDatHang_SqlRowMapper() );
    }
}
