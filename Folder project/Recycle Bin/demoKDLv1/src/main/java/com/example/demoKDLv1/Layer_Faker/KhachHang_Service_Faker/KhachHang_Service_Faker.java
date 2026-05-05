package com.example.demoKDLv1.Layer_Faker.KhachHang_Service_Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.DTO.SoluongConfig;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Service.KhachHang_Service;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Faker.DonDatHang_Service_Faker.DonDatHang_Service_Faker;
import com.example.demoKDLv1.Layer_Faker.KhachHangBuuDien_Service_Faker.KhachHangBuuDien_Service_Faker;
import com.example.demoKDLv1.Layer_Faker.KhachHangDuLich_Service_Faker.KhachHangDuLich_Service_Faker;


@Service
public class KhachHang_Service_Faker {

    @Autowired
    KhachHang_Service khachhang_Service;

    @Autowired
    DonDatHang_Service_Faker ddh_Service_Faker;

    @Autowired
    KhachHangDuLich_Service_Faker khdl_Service_Faker;

    @Autowired
    KhachHangBuuDien_Service_Faker khbd_Service_Faker;

    public KhachHang createMotKhachhang(VanPhongDaiDien vpdd1, SoluongConfig soluongConfig){
        KhachHang kh1= KhachHang_Faker.createFakeKhachhang(vpdd1);

        kh1= this.khachhang_Service.createKhachhang(kh1);

        List<DonDatHang> listDdh= this.ddh_Service_Faker.createNhieuDondathang(kh1, soluongConfig);
        // kh1.appendListDonDatHang(listDdh);

        KhachHangDuLich khdl1= null;
        KhachHangBuuDien khbd1= null;

        Random rand1= new Random();
        Integer chooseNum= rand1.nextInt(0, 2);

        if(chooseNum== 0){
            khdl1= this.khdl_Service_Faker.createMotKhdl(kh1);
        }else if(chooseNum== 1){
            khbd1= this.khbd_Service_Faker.createMotKhbd(kh1);
        }else{
            khdl1= this.khdl_Service_Faker.createMotKhdl(kh1);
            khbd1= this.khbd_Service_Faker.createMotKhbd(kh1);
        }
        
        return kh1;
    }

    public List<KhachHang> createNhieuKhachhang(VanPhongDaiDien vpdd1, SoluongConfig soluongConfig){
        List<KhachHang> listKH= new ArrayList<>();

        for(int i=0; i< soluongConfig.getKhachhang().getGiaTri(); i++){
            KhachHang kh1= this.createMotKhachhang(vpdd1, soluongConfig);

            listKH.add(kh1);
        }

        return listKH;
    }
    
}
