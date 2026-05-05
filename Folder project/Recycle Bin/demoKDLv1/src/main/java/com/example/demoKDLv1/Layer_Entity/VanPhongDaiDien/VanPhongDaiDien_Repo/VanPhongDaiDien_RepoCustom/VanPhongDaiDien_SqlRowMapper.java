package com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Repo.VanPhongDaiDien_RepoCustom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;

public class VanPhongDaiDien_SqlRowMapper 
    implements RowMapper<VanPhongDaiDien>
{

    @Override
    public VanPhongDaiDien mapRow
        (ResultSet ketquatrave, int sttHang) 
    {
        try{
            Long matp= null;
            String bang= null;
            String diachivanphong= null;
            String tentp= null;
            Timestamp thoigianlapvanphong= null;

            matp= ketquatrave.getLong("matp");
            bang= ketquatrave.getString("bang");
            diachivanphong= ketquatrave.getString("diachivanphong");
            tentp= ketquatrave.getString("tentp");
            thoigianlapvanphong= ketquatrave.getTimestamp("thoigianlapvanphong");

            VanPhongDaiDien vpdd= new VanPhongDaiDien(matp, tentp, diachivanphong, bang, thoigianlapvanphong);

            return vpdd;
        }

        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
 