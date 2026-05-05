package com.example.demoKDLv1.Layer_Faker.VanPhongDaiDien_Service_Faker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Service.VanPhongDaiDien_Service;
import com.example.demoKDLv1.Layer_Faker.CuaHang_Service_Faker.CuaHang_Service_Faker;
import com.example.demoKDLv1.Layer_Faker.KhachHang_Service_Faker.KhachHang_Service_Faker;

@Service
public class VanPhongDaiDien_Service_Faker {

    @Autowired
    VanPhongDaiDien_Service vpdd_Service;

    @Autowired
    KhachHang_Service_Faker khachhang_Service_Faker;

    @Autowired
    CuaHang_Service_Faker cuahang_Service_Faker;

    public VanPhongDaiDien createMotVpdd(SoluongConfig soluongConfig){
        VanPhongDaiDien vpdd1= VanPhongDaiDien_Faker.createFakeVpdd();

        vpdd1= this.vpdd_Service.createVpdd(vpdd1);

        List<KhachHang> listKhachhangOfVpdd= this.khachhang_Service_Faker.createNhieuKhachhang(vpdd1, soluongConfig);
        // vpdd1.appendListKhachHang(listKhachhangOfVpdd);
        
        List<CuaHang> listCuahangOfVpdd= this.cuahang_Service_Faker.createNhieuCuahang(vpdd1, soluongConfig);
        // vpdd1.appendListCuahang(listCuahangOfVpdd);
        
        return vpdd1;
    }

    public List<VanPhongDaiDien> createNhieuVpdd(SoluongConfig soluongConfig){
        List<VanPhongDaiDien> listVpdd= new ArrayList<>();

        for(int i=0; i<soluongConfig.getVpdd().getGiaTri(); i++){
            VanPhongDaiDien vpdd1= this.createMotVpdd(soluongConfig);

            listVpdd.add(vpdd1);
        }

        // listVpdd= this.vpdd_Service.creatAllVpdd(listVpdd)
        // vpdd1 phải có id thì mới create được KhachHang, CuaHang

        return listVpdd;
    }

}
