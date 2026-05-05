package com.example.demoKDLv1.Layer_Faker.FakerEntity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;

import lombok.Data;

@Data
public class MatHangDuocDatFaker {
    public static MatHangDuocDat createFakeMhdd(DonDatHang ddh1, MatHang mh1, AllEntityConfig allEntityConfig){
        DonDatHang ddh = null;
        MatHang mh= null;
        Integer soluongdat= null;
        Long giadat= null;
        Timestamp thoigiandat = null;

        ddh = ddh1;
        mh = mh1;
        soluongdat = allEntityConfig.getMhdd().getSoluongdat().getGiaTri();
        giadat = mh1.getGia();
        thoigiandat = allEntityConfig.getMhdd().getThoigiandat().getGiaTri();

        MatHangDuocDat mhdd1= new MatHangDuocDat(ddh, mh, soluongdat, giadat, thoigiandat);

        return mhdd1;
    }

    public static List<MatHangDuocDat> createFakeMhdd(DonDatHang ddh1, List<MatHang> listMh1, AllEntityConfig allEntityConfig){
        ArrayList<MatHangDuocDat> listMhdd = new ArrayList<>();

        for(MatHang mh1 : listMh1){
            MatHangDuocDat mhdd1= MatHangDuocDatFaker.createFakeMhdd(ddh1, mh1, allEntityConfig);

            listMhdd.add(mhdd1);
        }

        return listMhdd;
    }
}
