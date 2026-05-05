package com.example.demoKDLv1.Layer_Faker.KhachHangBuuDien_Service_Faker;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;

@Data
public class KhachHangBuuDien_Faker {

    public static KhachHangBuuDien createFakeKhbd(KhachHang kh1){

        String diachibuudien= Faker_Util.getDiachibuudien();

        KhachHangBuuDien khbd= new KhachHangBuuDien(kh1, diachibuudien);

        return khbd;
    }

}
