package com.example.demoKDLv1.Layer_Faker.FakerEntity;

import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien;
import com.example.demoKDLv1.Layer_Faker.ConfigFaker.EntityConfig.AllEntityConfig;
import com.example.demoKDLv1.ZZZ_Util.AddressCustomObject;
import com.example.demoKDLv1.ZZZ_Util.Faker_Util;

import lombok.Data;
import net.datafaker.providers.base.Address;

@Data
public class VanPhongDaiDienFaker {
    public static VanPhongDaiDien createFakeVpdd(AllEntityConfig allEntityConfig){
        Long maTP= null;
        String tenTP= null;
        String diachivanphong= null;
        String bang= null;
        Timestamp thoigianlapvanphong= null;

        Address address1 = Faker_Util.getAddress();

        maTP = null;
        tenTP= address1.cityName();
        diachivanphong = address1.fullAddress();
        bang = address1.state();
        thoigianlapvanphong = allEntityConfig.getVpdd().getThoigianlapvanphong().getGiaTri();


        VanPhongDaiDien vpdd1= new VanPhongDaiDien(maTP, tenTP, diachivanphong, bang, thoigianlapvanphong);

        return vpdd1;
    }
}
