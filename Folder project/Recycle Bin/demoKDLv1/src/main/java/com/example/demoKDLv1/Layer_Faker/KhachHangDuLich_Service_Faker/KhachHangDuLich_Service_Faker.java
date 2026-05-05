package com.example.demoKDLv1.Layer_Faker.KhachHangDuLich_Service_Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Service.KhachHangDuLich_Service;

@Service
public class KhachHangDuLich_Service_Faker {
    @Autowired
    KhachHangDuLich_Service khdl_Service;

    public KhachHangDuLich createMotKhdl(KhachHang kh1){
        KhachHangDuLich khdl1= KhachHangDuLich_Faker.createFakeKhdl(kh1);

        khdl1= this.khdl_Service.createKhdl(khdl1);

        return khdl1;
    }
}
