package com.example.demoKDLv1.Layer_Entity.DonDatHang;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table
@Data
public class DonDatHang {

    // @Version
    // private Integer version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long madon;

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 One(DonDatHang)- Many(MatHangDuocDat)
    @OneToMany(mappedBy = "donDatHang")
    Set<MatHangDuocDat> listMhdd= new HashSet<>() ;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
    
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 Many(đơn đặt hàng)- One(Khách hàng) 
    @ManyToOne
    @JoinColumn(name = "makh")
    KhachHang khachHang;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 
    
    private Timestamp ngaydathang;
    
    
    public DonDatHang() {
        // ...
    }

    public DonDatHang
        (
            Long madon, KhachHang khachHang, Timestamp ngaydathang
        ) 
        
        {
            this.madon = madon;
            this.khachHang = khachHang;
            this.ngaydathang = ngaydathang;
        }

    // public DonDatHang(Integer version, Long madon, KhachHang khachHang, Timestamp ngaydathang) {
    //     this.version = version;
    //     this.madon = madon;
    //     this.khachHang = khachHang;
    //     this.ngaydathang = ngaydathang;
    // }

    public void updateNotId(DonDatHang ddh2 ){
        // this.setMadon(this.getMadon());
        this.setKhachHang(ddh2.getKhachHang());
        this.setNgaydathang(ddh2.getNgaydathang());
    }

    public void appendListMhdd(List<MatHangDuocDat> listMhdd2 ){
        this.listMhdd.addAll(listMhdd2);
    }
}
