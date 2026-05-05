package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Service;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.Layer_Faker.FakerEntity.DonDatHangFaker;


// @Transactional
@Service
public class DonDatHangFS {
    @Autowired
    private AllEntityConfig allEntityConfig;

    @Autowired
    private DonDatHang_Service ddh_Service;

    @Autowired
    private MatHangDuocDatFS mhdd_FS;

    public DonDatHang createDdh(KhachHang kh1){
        DonDatHang ddh1 = DonDatHangFaker.createFakeDdh(kh1, this.allEntityConfig);

        ddh1 = this.ddh_Service.createDondathang(ddh1);

        // List<MatHangDuocDat> listMhdd = 
        //     this.mhdd_FS.createMhdd(
        //         ddh1, 
        //         this.allEntityConfig.getDdh().getSoMhdd().getGiaTri()
        //     );

        List<MatHangDuocDat> listMhdd = 
            this.mhdd_FS.createMhdd_v2(
                ddh1, 
                this.allEntityConfig.getDdh().getSoMhdd().getGiaTri()
            );

        return ddh1;
    }

    public List<DonDatHang> createDdh(KhachHang kh1, Integer soLuong){
        
        List<DonDatHang> listDdh= new ArrayList<>();

        for(int i=0; i<soLuong; i++){
            DonDatHang ddh1 = this.createDdh(kh1);

            listDdh.add(ddh1);
        }

        return listDdh;
    }
}
