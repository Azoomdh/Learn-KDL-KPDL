package com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;

@Repository
public class CuaHang_RepoCustom {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<CuaHang> getRandomCuahang(Long soluong){
        String lenhSql1= 
            "SELECT " 
                + " TOP("+ soluong+ ") "
                + " * "
                + " FROM cua_hang "
                + " ORDER BY NEWID() ";
        
        return jdbcTemplate.query(lenhSql1, new CuaHang_SqlRowMapper());
    }
}
