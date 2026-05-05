package com.example.demoKDLv1.Layer_Faker.MatHang_Service_Faker;

import java.sql.Timestamp;
import java.util.Random;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import net.datafaker.Faker;
import net.datafaker.providers.base.Commerce;

public class MatHang_Faker {

    private static String minNgayNhap= "01:01:2024 00:00:00";
    private static String maxNgayNhap= "01:01:2025 00:00:00";

    public static MatHang createFakeMathang(){
        Long maMH= null;
        String mota= null;
        String size= null;
        Double trongluong= null;
        Long gia= null;
        Timestamp thoigiannhaphang= null;

        Faker faker1= new Faker();
        Commerce sanpham1= faker1.commerce();

        maMH= null;
        mota= sanpham1.productName();
        size= MatHang_Faker.getFakeSize();
        trongluong= Faker_Util.getTrongLuong( 0.1, Double.parseDouble("10") );        
        gia= Faker_Util.getPrice( Long.parseLong("10000"), Long.parseLong("300000") );
        thoigiannhaphang= Faker_Util.getTimestampBetween(minNgayNhap, maxNgayNhap);
        
        MatHang mh1= new MatHang(maMH, mota, size, trongluong, gia, thoigiannhaphang);

        return mh1;
    }

    private static String getFakeSize(){
        Random rand1= new Random();
        Integer size= rand1.nextInt(0, 5);
        String sizeString= size.toString();

        return sizeString;
    }
}
