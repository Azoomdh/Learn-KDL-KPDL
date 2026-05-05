package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Service;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.Layer_Faker.FakerEntity.CuaHangFaker;


// @Transactional
@Service
public class CuaHangFS {

    @Autowired
    private AllEntityConfig allEntityConfig;

    @Autowired
    private CuaHang_Service ch_Service;

    @Autowired
    private MatHangDuocLuuTruFS mhdlt_FS;

    public CuaHang createCuaHang(VanPhongDaiDien vpdd1){
        CuaHang ch1= CuaHangFaker.createFakeCuaHang(vpdd1, this.allEntityConfig);

        ch1 = this.ch_Service.createCuaHang(ch1);

        // List<MatHangDuocLuuTru> listMhdlt = 
        //     this.mhdlt_FS.createMhdlt(
        //         ch1, 
        //         this.allEntityConfig.getCuahang().getSoMhdlt().getGiaTri()
        //     );
        
        List<MatHangDuocLuuTru> listMhdlt = 
            this.mhdlt_FS.createMhdlt_v2(
                ch1,
                this.allEntityConfig.getCuahang().getSoMhdlt().getGiaTri()
            );

        return ch1;
    }

    public List<CuaHang> createCuaHang(VanPhongDaiDien vpdd1, Integer soLuong){
        List<CuaHang> listCuahang = new ArrayList<>();

        for(int i=0; i<soLuong; i++){
            CuaHang ch1= this.createCuaHang(vpdd1);

            listCuahang.add(ch1);
        }

        return listCuahang;
    }
}
