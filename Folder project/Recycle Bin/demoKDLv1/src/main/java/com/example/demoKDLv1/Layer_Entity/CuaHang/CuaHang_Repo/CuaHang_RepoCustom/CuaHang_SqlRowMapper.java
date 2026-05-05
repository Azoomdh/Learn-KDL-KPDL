package com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Repo.VanPhongDaiDien_RepoJpa.VanPhongDaiDien_Repo;

public class CuaHang_SqlRowMapper 
    implements RowMapper<CuaHang>
{
    @Autowired
    VanPhongDaiDien_Repo vpdd_Repo;
    
    @Override
    public CuaHang mapRow ( ResultSet ketquatrave, int sttHang ) {
        try {
            Long mach= null;
            String sodt= null;
            Timestamp thoigianmoban= null;
            VanPhongDaiDien vpdd= null;

            mach= ketquatrave.getLong("mach");
            sodt= ketquatrave.getString("sodt");
            thoigianmoban= ketquatrave.getTimestamp("thoigianmoban");
            vpdd= vpdd_Repo.findById(ketquatrave.getLong("matp") ).get();

            CuaHang cuahang1= new CuaHang(mach, sodt, thoigianmoban, vpdd);

            return cuahang1;
        }
        
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
