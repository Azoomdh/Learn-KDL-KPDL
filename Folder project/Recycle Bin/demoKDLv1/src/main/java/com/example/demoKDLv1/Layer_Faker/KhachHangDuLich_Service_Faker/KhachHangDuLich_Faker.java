package com.example.demoKDLv1.Layer_Faker.KhachHangDuLich_Service_Faker;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;

@Data
public class KhachHangDuLich_Faker {
    
    public static KhachHangDuLich createFakeKhdl(KhachHang kh1){
        String huongdanviendulich= Faker_Util.getFullName();

        KhachHangDuLich khdl1= new KhachHangDuLich(kh1, huongdanviendulich);

        return khdl1;
    }
}
