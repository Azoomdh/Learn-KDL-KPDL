package com.example.demoKDLv1.Layer_Faker.MatHangDuocDat_Service_Faker;


import java.util.ArrayList;
import java.util.List;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;

@Data
public class MatHangDuocDat_Faker {

    private static Integer minSoluongdat= 1;
    private static Integer maxSoluongdat= 7;

    public static MatHangDuocDat createFakeMhdd(DonDatHang ddh1, MatHang mh1){
        DonDatHang ddh = null;
        MatHang mh= null;
        Integer soluongdat= null;
        Long giadat= null;

        ddh= ddh1;
        mh= mh1;
        soluongdat= Faker_Util.getSoluong(minSoluongdat, maxSoluongdat);
        giadat= mh1.getGia();

        MatHangDuocDat mhdd1= new MatHangDuocDat(ddh, mh, soluongdat, giadat);

        return mhdd1;
    }

    public static List<MatHangDuocDat> createFakeMhdd(DonDatHang ddh1, List<MatHang> listMh){
        List<MatHangDuocDat> listMhdd= new ArrayList<>();

        for(MatHang mh1 : listMh){
            MatHangDuocDat mhdd1= MatHangDuocDat_Faker.createFakeMhdd(ddh1, mh1);

            listMhdd.add(mhdd1);
        }

        return listMhdd;
    }

}
