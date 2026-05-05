package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Repo.KhachHangDuLich_RepoCustom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;

@Repository
public class KhachHangDuLich_RepoCustom {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Transactional
    public List<KhachHangDuLich> getRansomKhdl(Long soluong){
        String lenhSql1=
            "SELECT "
                + " TOP("+ soluong+") "
                + " * "
                + " FROM khach_hang_du_lich "
                + " ORDER BY NEWID() ";
        
        return jdbcTemplate.query(lenhSql1, new KhachHangDuLich_SqlRowMapper() );
    }

}
