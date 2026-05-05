package com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class MatHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maMH;

    private String mota;

    private String size;

    private Double trongluong;

    private Long gia;

    private Timestamp thoigiannhaphang;

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 danh sách MatHangDuocDat của 1 mặt hàng
    @OneToMany(mappedBy = "matHang")
    Set<MatHangDuocDat> listMhdd= new HashSet<>() ;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 danh sách MatHangDuocLuuTru của 1 mặt hàng
    @OneToMany(mappedBy = "matHang")
    Set<MatHangDuocLuuTru> listMhdlt= new HashSet<>() ;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 

    public MatHang(Long maMH, String mota, String size, Double trongluong, Long gia, Timestamp thoigiannhaphang) {
        this.maMH = maMH;
        this.mota = mota;
        this.size = size;
        this.trongluong = trongluong;
        this.gia = gia;
        this.thoigiannhaphang = thoigiannhaphang;
    }

    public MatHang() {
        // ...
    }

    public void updateNotId(MatHang mh2){
        // this.setMaMH(this.getMaMH());
        this.setMota(mh2.getMota());
        this.setSize(mh2.getSize());
        this.setTrongluong(mh2.getTrongluong());
        this.setGia(mh2.getGia());
        this.setThoigiannhaphang(mh2.getThoigiannhaphang());
    }


}
