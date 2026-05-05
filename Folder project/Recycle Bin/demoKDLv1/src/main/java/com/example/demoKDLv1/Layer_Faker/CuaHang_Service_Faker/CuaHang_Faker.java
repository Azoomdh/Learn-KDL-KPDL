package com.example.demoKDLv1.Layer_Faker.CuaHang_Service_Faker;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;

@Data
public class CuaHang_Faker {

    private static String minThoigianmoban= "01:01:2020 00:00:00";
    private static String maxThoigianmoban= "01:01:2025 00:00:00";

    public static CuaHang createFakeCuahang(VanPhongDaiDien vpdd1){
        Long maCH= null;
        String soDT= null;
        Timestamp thoigianmoban= null;
        VanPhongDaiDien vpdd= null;

        maCH= null;
        soDT= Faker_Util.getSdt();
        thoigianmoban= Faker_Util.getTimestampBetween(minThoigianmoban, maxThoigianmoban);
        vpdd= vpdd1;

        CuaHang ch1= new CuaHang(maCH, soDT, thoigianmoban, vpdd);

        return ch1;
    }

}
