package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Repo.MatHangDuocDat_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoJpa.DonDatHang_Repo;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Repo.MatHang_RepoJpa.MatHang_Repo;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;

public class MatHangDuocDat_SqlRowMapper 
    implements RowMapper<MatHangDuocDat>
{

    @Autowired
    DonDatHang_Repo dondathang_Repo;

    @Autowired
    MatHang_Repo mathang_Repo;

    @Override
    public MatHangDuocDat mapRow
        (ResultSet ketquatrave, int sttHang)
    
    {
        try{
            Long madon= null;
            Long mamh= null;

            Long giadat= null;
            Integer soluongdat= null;
            DonDatHang donDatHang= null;
            MatHang matHang= null;

            madon= ketquatrave.getLong("madon");
            mamh= ketquatrave.getLong("mamh");

            giadat= ketquatrave.getLong("giadat");
            soluongdat= ketquatrave.getInt("soluongdat");
            donDatHang= dondathang_Repo.findById(madon).get();
            matHang= mathang_Repo.findById(mamh).get();

            MatHangDuocDat mhdd= new MatHangDuocDat(donDatHang, matHang, soluongdat, giadat);

            return mhdd;
        }

        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
}
