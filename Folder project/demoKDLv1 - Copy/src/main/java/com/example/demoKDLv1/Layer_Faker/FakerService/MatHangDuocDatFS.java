package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Service;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.Layer_Faker.FakerEntity.MatHangDuocDatFaker;


// @Transactional
@Service
public class MatHangDuocDatFS {
    @Autowired
    private AllEntityConfig allEntityConfig;

    @Autowired
    private MatHangDuocDat_Service mhdd_Service; 

    @Autowired
    private MatHang_Service mh_Service;
    
    public MatHangDuocDat createMhdd(DonDatHang ddh1, MatHang mh1){
        MatHangDuocDat mhdd1 = MatHangDuocDatFaker.createFakeMhdd(ddh1, mh1, this.allEntityConfig);

        mhdd1 = this.mhdd_Service.createMhdd(mhdd1);
        
        return mhdd1;
    }

    public List<MatHangDuocDat> createMhdd(DonDatHang ddh1, Integer soLuong){

        List<MatHang> listMh = this.mh_Service.getRandomMathang(soLuong);

        List<MatHangDuocDat> listMhdd = new ArrayList<>();

        for(MatHang mh1 : listMh){
            MatHangDuocDat mhdd1= this.createMhdd(ddh1, mh1);

            listMhdd.add(mhdd1);
        }

        return listMhdd;
    }

    public List<MatHangDuocDat> createMhdd_v2(DonDatHang ddh1, Integer soLuong){

        List<MatHang> listMh = this.mh_Service.getRandomMathang(soLuong);

        List<MatHangDuocDat> listMhdd = MatHangDuocDatFaker.createFakeMhdd(ddh1, listMh, allEntityConfig);

        listMhdd = this.mhdd_Service.createAllMhdd(listMhdd);

        return listMhdd;
    }
}
