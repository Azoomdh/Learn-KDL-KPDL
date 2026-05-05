package com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;
import org.springframework.stereotype.Component;

import com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail.GiaConfigDetail;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail.NgayConfigDetail;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail.SizeConfigDetail;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail.SoluongConfigDetail;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.ConfigDetail.TrongluongConfigDetail;
import com.example.demoKDLv1.ZZZ_Util.Timestamp_Util;

import lombok.Data;

@Data
@Component
public class AllEntityConfig {
    private CuaHangConfig cuahang;
    private DonDatHangConfig ddh;
    private KhachHangConfig khachhang;
    private MatHangConfig mathang;
    private MatHangDuocDatConfig mhdd;
    private MatHangDuocLuuTruConfig mhdlt;
    private VanPhongDaiDienConfig vpdd;
    private Boolean nowMode;
    


    public AllEntityConfig(){
        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(Timestamp_Util.timeFormat);
        String timeStart = "01:01:2022 00:00:00";
        String timeNow = LocalDateTime.now().format(formatter1);

        this.nowMode= false;

        NgayConfigDetail cuahang_thoigianmoban= new NgayConfigDetail(timeStart, timeNow, nowMode);
        SoluongConfigDetail cuahang_soMhdlt = new SoluongConfigDetail(27, 33);
        this.cuahang = new CuaHangConfig(cuahang_thoigianmoban, cuahang_soMhdlt);


        SoluongConfigDetail ddh_soMhdd = new SoluongConfigDetail(4, 6);
        NgayConfigDetail ddh_ngaydathang = new NgayConfigDetail(timeStart, timeNow, nowMode);
        this.ddh = new DonDatHangConfig(ddh_soMhdd, ddh_ngaydathang);

        NgayConfigDetail kh_ngaydathangdautien = new NgayConfigDetail(timeStart, timeNow, nowMode);
        SoluongConfigDetail kh_soDdh = new SoluongConfigDetail(13, 17);
        this.khachhang = new KhachHangConfig(kh_ngaydathangdautien, kh_soDdh);

        NgayConfigDetail mh_thoigiannhaphang= new NgayConfigDetail(timeStart, timeNow, nowMode);
        GiaConfigDetail mh_gia= new GiaConfigDetail(Long.parseLong("70000"), Long.parseLong("100000") );
        TrongluongConfigDetail mh_trongluong = new TrongluongConfigDetail(0.1, 10.0);
        ArrayList<String> listSize= new ArrayList<>( Arrays.asList("XXS", "XS", "S", "M", "L", "XL", "XXL"));
        SizeConfigDetail mh_size = new SizeConfigDetail( listSize);
        this.mathang= new MatHangConfig(mh_thoigiannhaphang, mh_gia, mh_trongluong, mh_size);

        SoluongConfigDetail mhdd_soluongdat= new SoluongConfigDetail(4, 6);
        NgayConfigDetail mhdd_thoigiandat = new NgayConfigDetail(timeStart, timeNow, nowMode);
        this.mhdd = new MatHangDuocDatConfig(mhdd_soluongdat, mhdd_thoigiandat);

        SoluongConfigDetail mhdlt_soluongtrongkho = new SoluongConfigDetail(140, 150);
        NgayConfigDetail mhdlt_thoigianluutru = new NgayConfigDetail(timeStart, timeNow, nowMode);
        this.mhdlt = new MatHangDuocLuuTruConfig(mhdlt_soluongtrongkho, mhdlt_thoigianluutru);

        NgayConfigDetail vpdd_thoigianlapvanphong = new NgayConfigDetail(timeStart, timeNow, nowMode);
        SoluongConfigDetail vpdd_soCuahang = new SoluongConfigDetail(9, 11);
        SoluongConfigDetail vpdd_soKhachhang = new SoluongConfigDetail(120, 140);
        this.vpdd = new VanPhongDaiDienConfig(vpdd_thoigianlapvanphong, vpdd_soCuahang, vpdd_soKhachhang);
    
    }

    public AllEntityConfig
        (   
            CuaHangConfig cuahang, DonDatHangConfig ddh, KhachHangConfig khachhang,
            MatHangConfig mathang, MatHangDuocDatConfig mhdd, MatHangDuocLuuTruConfig mhdlt,
            VanPhongDaiDienConfig vpdd
        ) 
        
        {
            this.cuahang = cuahang;
            this.ddh = ddh;
            this.khachhang = khachhang;
            this.mathang = mathang;
            this.mhdd = mhdd;
            this.mhdlt = mhdlt;
            this.vpdd = vpdd;
        }

    
}
