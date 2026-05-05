package com.example.demoKDLv1.Layer_Faker.MatHangDuocLuuTru_Service_Faker;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

public class MatHangDuocLuuTru_Faker {

    private static Integer minSoluongtrongkho= 100;
    private static Integer maxSoluongtrongkho= 2000;

    private static String minThoigianluutru= "01:01:2024 00:00:00";
    private static String maxThoigianluutru= "01:01:2025 00:00:00";

    public static MatHangDuocLuuTru createFakeMhdlt(CuaHang ch1, MatHang mh1){
        CuaHang cuaHang= null;
        MatHang matHang= null;
        Integer soluongtrongkho= null;
        Timestamp thoigianluutru= null;

        cuaHang= ch1;
        matHang= mh1;
        soluongtrongkho= Faker_Util.getSoluong(minSoluongtrongkho, maxSoluongtrongkho);
        thoigianluutru= Faker_Util.getTimestampBetween(minThoigianluutru, maxThoigianluutru);

        MatHangDuocLuuTru mhdlt1= new MatHangDuocLuuTru(cuaHang, matHang, soluongtrongkho, thoigianluutru);

        return mhdlt1;
    }

    public static List<MatHangDuocLuuTru> createFakeMhdlt(CuaHang ch1, List<MatHang> listMh){
        List<MatHangDuocLuuTru> listMhdlt= new ArrayList<>();

        for(MatHang mh1 : listMh){
            MatHangDuocLuuTru mhdlt1= MatHangDuocLuuTru_Faker.createFakeMhdlt(ch1, mh1);

            listMhdlt.add(mhdlt1);
        }

        return listMhdlt;
    }
}
