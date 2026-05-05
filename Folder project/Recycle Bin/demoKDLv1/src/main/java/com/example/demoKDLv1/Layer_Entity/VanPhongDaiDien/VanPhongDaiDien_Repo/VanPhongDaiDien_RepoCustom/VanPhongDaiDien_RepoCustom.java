package com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Repo.VanPhongDaiDien_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;

@Repository
public class VanPhongDaiDien_RepoCustom {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<VanPhongDaiDien> getRandomVpdd(Long soluong){
        String lenhSql1= 
            "SELECT " 
                + " TOP("+ soluong+ ") "
                + " * "
                + " FROM van_phong_dai_dien "
                + " ORDER BY NEWID() ";
        
        return jdbcTemplate.query(lenhSql1, new VanPhongDaiDien_SqlRowMapper());
    }
}
