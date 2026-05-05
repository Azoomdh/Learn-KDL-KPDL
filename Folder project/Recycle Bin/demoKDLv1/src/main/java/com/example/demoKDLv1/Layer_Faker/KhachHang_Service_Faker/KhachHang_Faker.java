package com.example.demoKDLv1.Layer_Faker.KhachHang_Service_Faker;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

public class KhachHang_Faker {

    private static String minNgaydathangdautien= "01:01:2020 00:00:00";
    private static String maxNgaydathangdautien= "01:01:2025 00:00:00";


    public static KhachHang createFakeKhachhang(VanPhongDaiDien vpdd1){
        Long maKH= null;
        String tenKH= null;
        Timestamp ngaydathangdautien= null;
        VanPhongDaiDien vpdd= null;

        maKH= null;
        tenKH= Faker_Util.getFullName();
        ngaydathangdautien= Faker_Util.getTimestampBetween(minNgaydathangdautien, maxNgaydathangdautien);
        vpdd= vpdd1;

        KhachHang kh1= new KhachHang(maKH, tenKH, ngaydathangdautien, vpdd);

        return kh1;

    }
}
