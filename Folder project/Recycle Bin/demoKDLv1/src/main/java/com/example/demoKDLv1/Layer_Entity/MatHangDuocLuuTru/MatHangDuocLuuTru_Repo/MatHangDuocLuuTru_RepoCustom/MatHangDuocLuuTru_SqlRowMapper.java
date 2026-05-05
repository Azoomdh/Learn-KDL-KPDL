package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Repo.MatHangDuocLuuTru_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoJpa.CuaHang_Repo;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Repo.MatHang_RepoJpa.MatHang_Repo;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;

public class MatHangDuocLuuTru_SqlRowMapper 
    implements RowMapper<MatHangDuocLuuTru>
{
    @Autowired
    CuaHang_Repo cuahang_Repo;

    @Autowired
    MatHang_Repo mathang_Repo;

    @Override
    public MatHangDuocLuuTru mapRow
        (ResultSet ketquatrave, int sttHang)
    {
        try{
            Integer soluongtrongkho= null;
            Timestamp thoigianluutru= null;
            CuaHang cuaHang= null;
            MatHang matHang= null;

            soluongtrongkho= ketquatrave.getInt("soluongtrongkho");
            thoigianluutru= ketquatrave.getTimestamp("thoigianluutru");
            cuaHang= cuahang_Repo.findById(ketquatrave.getLong("mach")).get();
            matHang= mathang_Repo.findById(ketquatrave.getLong("mamh")).get();

            MatHangDuocLuuTru mhdlt= new MatHangDuocLuuTru(cuaHang, matHang, soluongtrongkho, thoigianluutru);

            return mhdlt;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
