package com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table
@Data
public class VanPhongDaiDien{

    // @Version
    // private Integer version;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long maTP;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String tenTP;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String diachivanphong;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String bang;

    private Timestamp thoigianlapvanphong;

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 1 vpdd có nhiều cửa hàng
    @OneToMany(mappedBy = "vpdd")
    Set<CuaHang> listCuahang= new HashSet<>() ;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 1 vpdd có nhiều khách hàng
    @OneToMany(mappedBy = "vpdd")
    Set<KhachHang> listKhachHang= new HashSet<>() ;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 



    public VanPhongDaiDien(Long maTP, String tenTP, String diachivanphong, String bang, Timestamp thoigianlapvanphong) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.diachivanphong = diachivanphong;
        this.bang = bang;
        this.thoigianlapvanphong = thoigianlapvanphong;
    }

    // public VanPhongDaiDien(Integer version, Long maTP, String tenTP, String diachivanphong, String bang,
    //         Timestamp thoigianlapvanphong) {
    //     this.version = version;
    //     this.maTP = maTP;
    //     this.tenTP = tenTP;
    //     this.diachivanphong = diachivanphong;
    //     this.bang = bang;
    //     this.thoigianlapvanphong = thoigianlapvanphong;
    // }

    public VanPhongDaiDien() {
    }

    public void updateNotId(VanPhongDaiDien vpdd2){
        // this.setMaTP(this.getMaTP());
        this.setTenTP(vpdd2.getTenTP());
        this.setDiachivanphong(vpdd2.getDiachivanphong());
        this.setBang(vpdd2.getBang());
        this.setThoigianlapvanphong(vpdd2.getThoigianlapvanphong());
    }

    public void appendListKhachHang(List<KhachHang> listKh2 ){
        for(KhachHang kh2 : listKh2){
            this.listKhachHang.add(kh2);
        }
    }

    public void appendListCuahang(List<CuaHang> listCh2){
        this.listCuahang.addAll(listCh2);
    }
}