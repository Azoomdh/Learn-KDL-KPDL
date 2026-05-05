package com.example.demoKDLv1.Layer_Faker.MatHangDuocDat_Service_Faker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service.MatHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Service.MatHangDuocDat_Service;

@Service
public class MatHangDuocDat_Service_Faker {

    @Autowired
    MatHang_Service matHang_Service;

    @Autowired
    MatHangDuocDat_Service mhdd_Service;


    public List<MatHangDuocDat> createNhieuMhdd(DonDatHang ddh, SoluongConfig soluongConfig){
        Integer soLoaiMhCanFake= null;
        List<MatHang> listMh= null;
        List<MatHangDuocDat> listMhdd= null;

        soLoaiMhCanFake= soluongConfig.getMhdd().getGiaTri();

        listMh= this.matHang_Service.getRandomMathang(soLoaiMhCanFake);

        listMhdd= MatHangDuocDat_Faker.createFakeMhdd(ddh, listMh);

        listMhdd= this.mhdd_Service.createAllMhdd(listMhdd);

        return listMhdd;
    }
}
