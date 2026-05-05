package com.example.demoKDLv1.Layer_Faker.DonDatHang_Service_Faker;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Faker.MatHangDuocDat_Service_Faker.MatHangDuocDat_Service_Faker;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;

@Data
public class DonDatHang_Faker {

    private static String minNgaydathang= "01:01:2020 00:00:00";
    private static String maxNgaydathang= "01:01:2025 00:00:00";

    @Autowired
    private static MatHangDuocDat_Service_Faker mhdd_Service_Faking;

    public static DonDatHang createFakeDdh(KhachHang kh1){
        Long madon= null;
        KhachHang khachhang= null;
        Timestamp ngaydathang= null;

        madon= null;
        khachhang= kh1;
        ngaydathang= Faker_Util.getTimestampBetween(minNgaydathang, maxNgaydathang);

        DonDatHang ddh1= new DonDatHang(madon, khachhang, ngaydathang);

        return ddh1;
    }

    public static List<DonDatHang> createFakeDdh(List<KhachHang> listKh){
        List<DonDatHang> listDdh= new ArrayList<>();

        for(KhachHang kh1 : listKh){
            DonDatHang ddh1= DonDatHang_Faker.createFakeDdh(kh1);

            listDdh.add(ddh1);
        }


        return listDdh;
    }
}
