package com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Repo.MatHang_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;

public class MatHang_SqlRowMapper 
    implements RowMapper<MatHang>
{

    @Override
    public MatHang mapRow(ResultSet ketquatrave, int sttHang) {

        try {
            Long mamh= null;
            Long gia= null;
            String mota= null;
            String size= null;
            Timestamp thoigiannhaphang= null;
            Double trongluong= null;

            mamh= ketquatrave.getLong("mamh");
            gia= ketquatrave.getLong("gia");
            mota= ketquatrave.getString("mota");
            size= ketquatrave.getString("size");
            thoigiannhaphang= ketquatrave.getTimestamp("thoigiannhaphang");
            trongluong= ketquatrave.getDouble("trongluong");

            MatHang mathang1= new MatHang(mamh, mota, size, trongluong, gia, thoigiannhaphang);

            return mathang1;
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    
}
