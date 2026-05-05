package com.example.demoKDLv1.ZZZ_Util;

import java.util.Locale;

import lombok.Data;
import net.datafaker.Faker;
import net.datafaker.providers.base.Address;

@Data
public class AddressCustomObject {
    private String bang;
    private String diaChiVanPhong;
    private String tenTp;

    public AddressCustomObject(String bang, String diaChiVanPhong, String tenTp) {
        this.bang = bang;
        this.diaChiVanPhong = diaChiVanPhong;
        this.tenTp = tenTp;
    }

    public AddressCustomObject() {
    }

    public static void main(String[] args) {
        Faker faker1 = new Faker(new Locale("vi"));

        Address address1 = faker1.address();
        System.out.println(address1.streetAddress());
        System.out.println(address1.buildingNumber());
        System.out.println(address1.streetName());
    }
}
