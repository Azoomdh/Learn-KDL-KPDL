package com.example.demoKDLv1.ZZZ_Util;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import com.matchory.packages.jpostal.AddressExpander;

import net.datafaker.Faker;
import net.datafaker.providers.base.Address;
import net.datafaker.providers.base.Commerce;

public class Faker_Util {

    private static Faker fakerObject = new Faker(new Locale("vi"));

    public static String getFullName(){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;
        return faker1.name().fullName();
    }

    public static String getLastName(){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;
        return faker1.name().lastName();
    }

    public static String getFirstName(){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;
        return faker1.name().firstName();
    }

    public static Timestamp getTimestampBetween(String minDate, String maxDate){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;
        
        Date minDateUtil= Timestamp_Util.convertString2DateUtils(minDate);
        Date maxDateUtil= Timestamp_Util.convertString2DateUtils(maxDate);

        Date dateUtilTraVe= faker1.date().between(minDateUtil, maxDateUtil);
        
        Timestamp timestampTraVe= Timestamp_Util.convertDateUtils2Timestamp(dateUtilTraVe);

        return timestampTraVe;
    }

    public static Address getAddress(){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;

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

        trongluongTrave = Math.round(trongluongTrave*100.0)/100.0;

        return trongluongTrave;
    }

    // public static String getSdt(){
    //     // Faker faker1= new Faker();
    //     Faker faker1= Faker_Util.fakerObject;

    //     String sdt= faker1.phoneNumber().cellPhone();

    //     return sdt;
    // }

    public static String getSdt(){
        ArrayList<String> listDauSoNhaMang = new ArrayList<>(Arrays.asList("032", "033", "034", "035", "036", "037", "038", "039", "096", "097", "098", "086", "083", "084", "085", "081", "082", "088", "091", "094", "070", "079", "077", "076", "078", "090", "093", "089", "056", "058", "092", "059", "099"));

        Random random1 = new Random();
        
        String result = "";
        
        String dauSoNhaMang = 
            listDauSoNhaMang.get(
                random1.nextInt(0, listDauSoNhaMang.size())
            );
        
        Integer soDuoiInteger = random1.nextInt(0_000_000, 9_999_999);
        String duoiSoNgauNhienCuaNguoiDung_String = String.format("%07d", soDuoiInteger);

        result = dauSoNhaMang + duoiSoNgauNhienCuaNguoiDung_String;

        return result;
    }


    public static String getDiachibuudien(){
        // Faker faker1= new Faker();
        Faker faker1= Faker_Util.fakerObject;

        String diachibuudien= faker1.address().postcode();
        return diachibuudien;
    }
    
    public static Integer getSoluong(Integer minSoluong, Integer maxSoluong){
        Random rand1= new Random();

        return rand1.nextInt(minSoluong, maxSoluong);
    }

    public static String getSize(ArrayList<String> listSize){

        Random rand1= new Random();
        Integer size1 = rand1.nextInt(listSize.size());

        return listSize.get(size1);
    }

    // public static String getBang(){
    //     ArrayList<String> listSize = 
    //         new ArrayList<>(
    //             Arrays.asList("Sơn La", "Lai Châu", "Lạng Sơn", "Tuyên Quang", "Lào Cai", "Thái Nguyên", "Điện Biên", "Phú Thọ", "Bắc Ninh", "Hà Nội", "Quảng Ninh", "Hải Phòng", "Hưng Yên", "Ninh Bình", "Thanh Hóa", "Nghệ An", "Hà Tĩnh", "Quảng Trị", "Huế", "Đà Nẵng", "Quảng Ngãi", "Gia Lai", "Đắk Lắk", "Khánh Hòa", "Lâm Đồng", "Đồng Nai", "Thành phố Hồ Chí Minh", "Tây Ninh", "Đồng Tháp", "Vĩnh Long", "Cần Thơ", "An Giang", "Cà Mau")
    //         );

    //     Random rand1= new Random();
    //     Integer size1 = rand1.nextInt(listSize.size());

    //     return listSize.get(size1);
    // }

    public static AddressCustomObject getAddress_v2(){
        return new AddressCustomObject();
    }

    public static Commerce getSanpham(){
        return Faker_Util.fakerObject.commerce();
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            // System.out.println(Faker_Util.getTrongLuong(10.0, 90.0));
            // System.out.println(Faker_Util.getFullName());
            // System.out.println(Faker_Util.getSdt());
            // System.out.println(Faker_Util.getDiachibuudien());
            // System.out.println(Faker_Util.getAddress().fullAddress());
            // System.out.println(Faker_Util.getBang());
            // System.out.println(Faker_Util.getAddress().streetName());
            // System.out.println(Faker_Util.getAddress().city());
            // System.out.println("🟥🟥🟥🟥🟥");
        }

    }

    // public static void main(String[] args) {
    //     String s= "032, 033, 034, 035, 036, 037, 038, 039, 096, 097, 098, 086, 083, 084, 085, 081, 082, 088, 091, 094, 070, 079, 077, 076, 078, 090, 093, 089, 056, 058, 092, 059, 099";

    //     String result = "";

    //     for(String xau : s.split(", ")){
    //         String xau2 = "\""+xau+"\", ";
    //         result = result + xau2;            
    //     }

    //     result = result.substring(0, result.length()-2);

    //     System.out.println(result);
    // }

    // public static void main(String[] args) {
    //     String s = 
    //         """
    //         Sơn La
    //         Lai Châu
    //         Lạng Sơn
    //         Tuyên Quang
    //         Lào Cai
    //         Thái Nguyên
    //         Điện Biên
    //         Phú Thọ
    //         Bắc Ninh
    //         Hà Nội
    //         Quảng Ninh
    //         Hải Phòng
    //         Hưng Yên
    //         Ninh Bình
    //         Thanh Hóa
    //         Nghệ An
    //         Hà Tĩnh
    //         Quảng Trị
    //         Huế
    //         Đà Nẵng
    //         Quảng Ngãi
    //         Gia Lai
    //         Đắk Lắk
    //         Khánh Hòa
    //         Lâm Đồng
    //         Đồng Nai
    //         Thành phố Hồ Chí Minh
    //         Tây Ninh
    //         Đồng Tháp
    //         Vĩnh Long
    //         Cần Thơ
    //         An Giang
    //         Cà Mau""";

    //     String result = "";

    //     for(String xau : s.split("\n")){
    //         result = result + "\""+xau+"\"" + ", ";
    //     }

    //     result = result.substring(0, result.length()-2);

    //     System.out.println(result);

    //     // "Sơn La", "Lai Châu", "Lạng Sơn", "Tuyên Quang", "Lào Cai", "Thái Nguyên", "Điện Biên", "Phú Thọ", "Bắc Ninh", "Hà Nội", "Quảng Ninh", "Hải Phòng", "Hưng Yên", "Ninh Bình", "Thanh Hóa", "Nghệ An", "Hà Tĩnh", "Quảng Trị", "Huế", "Đà Nẵng", "Quảng Ngãi", "Gia Lai", "Đắk Lắk", "Khánh Hòa", "Lâm Đồng", "Đồng Nai", "Thành phố Hồ Chí Minh", "Tây Ninh", "Đồng Tháp", "Vĩnh Long", "Cần Thơ", "An Giang", "Cà Mau"
    // }

    //     public static void main(String[] args) {
    //     String s = 
    //         """
    //         Thục Phán
    //         Chiềng Cơi
    //         Tân Phong
    //         Lương Văn Tri
    //         Minh Xuân
    //         Yên Bái
    //         Phan Đình Phùng
    //         Điện Biên Phủ
    //         Việt Trì
    //         Bắc Giang
    //         Hoàn Kiếm
    //         Hạ Long
    //         Thủy Nguyên
    //         Phố Hiến
    //         Hoa Lư
    //         Hạc Thành
    //         Trường Vinh
    //         Thành Sen
    //         Đồng Hới
    //         Thuận Hóa
    //         Hải Châu
    //         Cẩm Thành
    //         Quy Nhơn
    //         Buôn Ma Thuột
    //         Nha Trang
    //         Xuân Hương - Đà Lạt
    //         Trấn Biên
    //         Sài Gòn
    //         Long An
    //         Mỹ Tho
    //         Long Châu
    //         Ninh Kiều
    //         Rạch Giá
    //         Tân Thành
    //         """;

    //     String result = "";

    //     for(String xau : s.split("\n")){
    //         result = result + "\""+xau+"\"" + ", ";
    //     }

    //     result = result.substring(0, result.length()-2);

    //     System.out.println(result);

    //     // "Thục Phán", "Chiềng Cơi", "Tân Phong", "Lương Văn Tri", "Minh Xuân", "Yên Bái", "Phan Đình Phùng", "Điện Biên Phủ", "Việt Trì", "Bắc Giang", "Hoàn Kiếm", "Hạ Long", "Thủy Nguyên", "Phố Hiến", "Hoa Lư", "Hạc Thành", "Trường Vinh", "Thành Sen", "Đồng Hới", "Thuận Hóa", "Hải Châu", "Cẩm Thành", "Quy Nhơn", "Buôn Ma Thuột", "Nha Trang", "Xuân Hương - Đà Lạt", "Trấn Biên", "Sài Gòn", "Long An", "Mỹ Tho", "Long Châu", "Ninh Kiều", "Rạch Giá", "Tân Thành"
    // }
}
