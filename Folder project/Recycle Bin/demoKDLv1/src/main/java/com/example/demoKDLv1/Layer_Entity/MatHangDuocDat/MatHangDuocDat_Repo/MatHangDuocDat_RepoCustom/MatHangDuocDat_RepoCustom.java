package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Repo.MatHangDuocDat_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;

@Repository
public class MatHangDuocDat_RepoCustom {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<MatHangDuocDat> getRandomMhdd(Long soluong){
        String lenhSql1=
            "SELECT "
                + " TOP("+ soluong+") "
                + " * "
                + " FROM mat_hang_duoc_dat "
                + " ORDER BY NEWID() ";
        
        return jdbcTemplate.query(lenhSql1, new MatHangDuocDat_SqlRowMapper());
    }

}
