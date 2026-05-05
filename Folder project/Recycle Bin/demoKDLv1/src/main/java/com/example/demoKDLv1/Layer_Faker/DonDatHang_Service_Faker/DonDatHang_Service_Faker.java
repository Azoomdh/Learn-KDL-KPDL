package com.example.demoKDLv1.Layer_Faker.DonDatHang_Service_Faker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Service.DonDatHang_Service;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Faker.MatHangDuocDat_Service_Faker.MatHangDuocDat_Service_Faker;

@Service
public class DonDatHang_Service_Faker {

    @Autowired
    DonDatHang_Service donDatHang_Service;

    @Autowired
    MatHangDuocDat_Service_Faker mhdd_Service_Faker;


    public DonDatHang createMotDondathang(KhachHang kh1, SoluongConfig soluongConfig){
        DonDatHang ddh1= DonDatHang_Faker.createFakeDdh(kh1);

        ddh1= this.donDatHang_Service.createDondathang(ddh1);

        List<MatHangDuocDat> listMhdd= this.mhdd_Service_Faker.createNhieuMhdd(ddh1, soluongConfig);
        // ddh1.appendListMhdd(listMhdd);

        return ddh1;
    }

    public List<DonDatHang> createNhieuDondathang(KhachHang kh1, SoluongConfig soluongConfig){
        List<DonDatHang> listDdh= new ArrayList<>();

        for(int i=0; i< soluongConfig.getDdh().getGiaTri(); i++){
            DonDatHang ddh1= this.createMotDondathang(kh1, soluongConfig);

            listDdh.add(ddh1);
        }

        return listDdh;
    }
}

