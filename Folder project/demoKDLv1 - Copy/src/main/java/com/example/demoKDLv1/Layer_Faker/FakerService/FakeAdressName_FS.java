package com.example.demoKDLv1.Layer_Faker.FakerService;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.TenPho.TenPho;
import com.example.demoKDLv1.Layer_Entity.TenPho.TenPho_Service;
import com.example.demoKDLv1.Layer_Entity.TenXa.TenXa;
import com.example.demoKDLv1.Layer_Entity.TenXa.TenXa_Service;
import com.example.demoKDLv1.ZZZ_Util.AddressCustomObject;

@Service
public class FakeAdressName_FS {

    @Autowired
    private TenPho_Service tenPho_Service;

    @Autowired
    private TenXa_Service tenXa_Service;

    public AddressCustomObject getAddress(){
        TenXa tenXa = this.tenXa_Service.getRandomTenXa(1).get(0);
        TenPho tenPho = this.tenPho_Service.getRandomTenPho(1).get(0);

        String bang = tenXa.getTenTinh();
        String tenTP = tenXa.getTenXa();

        Random random1 = new Random();

        String diaChiVanPhong = ""+ random1.nextInt(1, 180) + ", " + tenPho.getTenPho() + ", " + tenTP + ", " + bang;

        AddressCustomObject address1 = new AddressCustomObject(bang, diaChiVanPhong, tenTP);

        return address1;
    }
}
