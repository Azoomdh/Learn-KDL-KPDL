package com.example.demoKDLv1.Layer_Faker.CuaHang_Service_Faker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Service.CuaHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Faker.MatHangDuocLuuTru_Service_Faker.MatHangDuocLuuTru_Service_Faker;

@Service
public class CuaHang_Service_Faker {
    
    @Autowired
    CuaHang_Service cuahang_Service;

    @Autowired
    MatHangDuocLuuTru_Service_Faker mhdlt_Service_Faker;

    public CuaHang createMotCuahang(VanPhongDaiDien vpdd1, SoluongConfig soluongConfig){
        CuaHang cuahang1= CuaHang_Faker.createFakeCuahang(vpdd1);

        cuahang1= this.cuahang_Service.createCuaHang(cuahang1);

        List<MatHangDuocLuuTru> listMhdlt= this.mhdlt_Service_Faker.createNhieuMhdlt(cuahang1, soluongConfig);
        // cuahang1.appendListMhdlt(listMhdlt); gây lỗi
        
        return cuahang1;
    }

    public List<CuaHang> createNhieuCuahang(VanPhongDaiDien vpdd1, SoluongConfig soluongConfig){
        List<CuaHang> listCuahang= new ArrayList<>();

        for(int i=0; i< soluongConfig.getCuahang().getGiaTri(); i++){
            CuaHang cuahang1= this.createMotCuahang(vpdd1, soluongConfig);

            listCuahang.add(cuahang1);
        }

        return listCuahang;
    }
}
