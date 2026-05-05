package com.example.demoKDLv1.Layer_Faker.MatHangDuocLuuTru_Service_Faker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service.MatHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Service.MatHangDuocLuuTru_Service;

@Service
public class MatHangDuocLuuTru_Service_Faker {

    @Autowired
    MatHang_Service matHang_Service;

    @Autowired
    MatHangDuocLuuTru_Service mhdlt_Service;

    public List<MatHangDuocLuuTru> createNhieuMhdlt(CuaHang ch1, SoluongConfig soluongConfig){
        Integer soLoaiMhCanFake= null;
        List<MatHang> listMh= null;
        List<MatHangDuocLuuTru> listMhdlt= null;

        soLoaiMhCanFake= soluongConfig.getMhdlt().getGiaTri();

        listMh= this.matHang_Service.getRandomMathang(soLoaiMhCanFake);

        listMhdlt= MatHangDuocLuuTru_Faker.createFakeMhdlt(ch1, listMh);

        listMhdlt= this.mhdlt_Service.createAllMhdlt(listMhdlt);

        return listMhdlt;
    }
}
