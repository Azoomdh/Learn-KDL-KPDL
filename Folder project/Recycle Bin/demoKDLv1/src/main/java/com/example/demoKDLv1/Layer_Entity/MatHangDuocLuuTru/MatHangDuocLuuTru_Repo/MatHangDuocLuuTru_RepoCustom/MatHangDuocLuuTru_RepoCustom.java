package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Repo.MatHangDuocLuuTru_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;

@Repository
public class MatHangDuocLuuTru_RepoCustom {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<MatHangDuocLuuTru> getRandomMhdlt(Long soluong){
        String lenhSql1= 
            "SELECT " 
                + " TOP("+ soluong+ ") "
                + " * "
                + " FROM mat_hang_duoc_luu_tru "
                + " ORDER BY NEWID() ";
        
        return jdbcTemplate.query(lenhSql1, new MatHangDuocLuuTru_SqlRowMapper());
    }
}
