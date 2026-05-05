package com.example.demoKDLv1.Layer_Faker.KhachHangBuuDien_Service_Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Service.KhachHangBuuDien_Service;

@Service
public class KhachHangBuuDien_Service_Faker {

    @Autowired
    private KhachHangBuuDien_Service khbd_Service;

    public KhachHangBuuDien createMotKhbd(KhachHang kh1){
        KhachHangBuuDien khbd1= KhachHangBuuDien_Faker.createFakeKhbd(kh1);

        khbd1= this.createMotKhbd(kh1);

        return khbd1;
    }
}
