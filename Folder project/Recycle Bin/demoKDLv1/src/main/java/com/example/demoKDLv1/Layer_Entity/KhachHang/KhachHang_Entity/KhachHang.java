package com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
@Inheritance(strategy= InheritanceType.JOINED)
public class KhachHang {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long maKH;

    private String tenKH;

    private Timestamp ngaydathangdautien;

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 Many(Khách hàng)- One(văn phòng đại diện)
    @ManyToOne
    @JoinColumn(name = "matp")
    VanPhongDaiDien vpdd;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 One(khách hàng) - Many(DonDatHang)
    @OneToMany(mappedBy = "khachHang")
    Set<DonDatHang> listDonDatHang= new HashSet<>() ;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 



    public KhachHang(Long maKH, String tenKH, Timestamp ngaydathangdautien, VanPhongDaiDien vpdd) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngaydathangdautien = ngaydathangdautien;
        this.vpdd = vpdd;
    }

    public KhachHang() {
        // ...
    }

    public void updateNotId(KhachHang kh2){
        // this.setMaKH(this.getMaKH());
        this.setTenKH(kh2.getTenKH());
        this.setNgaydathangdautien(kh2.getNgaydathangdautien());
        this.setVpdd(kh2.getVpdd());
    }

    public void appendListDonDatHang(List<DonDatHang> listDondathang2){
        this.listDonDatHang.addAll(listDondathang2);
    }
}
