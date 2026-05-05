package com.example.demoKDLv1.ZZZ_Util;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import net.datafaker.Faker;
import net.datafaker.providers.base.Address;
import net.datafaker.providers.base.Commerce;

public class Faker_Util {
    public static String getFullName(){
        Faker faker1= new Faker();
        return faker1.name().fullName();
    }

    public static String getLastName(){
        Faker faker1= new Faker();
        return faker1.name().lastName();
    }

    public static String getFirstName(){
        Faker faker1= new Faker();
        return faker1.name().firstName();
    }

    public static Timestamp getTimestampBetween(String minDate, String maxDate){
        Faker faker1= new Faker();
        
        Date minDateUtil= Timestamp_Util.convertString2DateUtils(minDate);
        Date maxDateUtil= Timestamp_Util.convertString2DateUtils(maxDate);

        Date dateUtilTraVe= faker1.date().between(minDateUtil, maxDateUtil);
        
        Timestamp timestampTraVe= Timestamp_Util.convertDateUtils2Timestamp(dateUtilTraVe);

        return timestampTraVe;
    }

    public static Address getAddress(){
        Faker faker1= new Faker();

        Address addressTrave= faker1.address();

        return addressTrave;
    }
    
    public static Long getPrice(Long minPrice, Long maxPrice){
        Long heso= Long.valueOf(1000);
        
        Long min2= minPrice/heso;
        Long max2= maxPrice/heso;

        Random rand1= new Random();

        //                                                                          // origin: Giá trị bắt đầu của khoảng (bao gồm).
        //                                                                          // bound: Giá trị kết thúc của khoảng (không bao gồm).
        Long giaTrave = rand1.nextLong(min2, max2) *heso;
        
        return giaTrave;
    }

    public static Double getTrongLuong(Double minTrongluong, Double maxTrongluong){
        Random rand1= new Random();
        //                                                                          // origin: Giá trị bắt đầu của khoảng (bao gồm).
        //                                                                          // bound: Giá trị kết thúc của khoảng (không bao gồm).
        Double trongluongTrave= rand1.nextDouble(minTrongluong, maxTrongluong);

        return trongluongTrave;
    }

    public static String getSdt(){
        Faker faker1= new Faker();

        String sdt= faker1.phoneNumber().cellPhone();

        return sdt;
    }

    public static String getDiachibuudien(){
        Faker faker1= new Faker();
        String diachibuudien= faker1.address().postcode();
        return diachibuudien;
    }
    
    public static Integer getSoluong(Integer minSoluong, Integer maxSoluong){
        Random rand1= new Random();

        return rand1.nextInt(minSoluong, maxSoluong);
    }

    public static void main(String[] args) {
        Faker faker1= new Faker();
        for(int i=0; i<10; i++){
            System.out.println(faker1.food().dish());
            Commerce sanpham1= faker1.commerce();
            System.out.println(sanpham1.brand()+"- 0");
            System.out.println(sanpham1.department()+ "- 1");
            System.out.println(sanpham1.material()+"- 2");
            System.out.println(sanpham1.price()+"- 3");
            System.out.println(sanpham1.price(100000, 300000)+"- 4");
            System.out.println(sanpham1.productName()+"- 5");
            System.out.println(sanpham1.promotionCode()+"- 6");
            System.out.println(sanpham1.promotionCode(50)+"- 7");
            System.out.println(sanpham1.vendor()+"- 8");
            System.out.println("\n\n\n ------------------------------------- \n\n\n");

            
        }
    }

}
