package com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Repo.MatHang_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;

@Repository
public class MatHang_RepoCustom {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<MatHang> getRandomMatHang(Integer soluong){
        String lenhSql1=
            "SELECT "
                + " TOP ("+ soluong+") "
                + " * "
                + " FROM mat_hang "
                + " ORDER BY NEWID() ";

        return jdbcTemplate.query(lenhSql1, new MatHang_SqlRowMapper());
    }
}
