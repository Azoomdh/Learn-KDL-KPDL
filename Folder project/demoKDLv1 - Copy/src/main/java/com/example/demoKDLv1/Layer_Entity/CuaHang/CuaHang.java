package com.example.demoKDLv1.Layer_Entity.CuaHang;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien;

import jakarta.persistence.Column;
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
public class CuaHang {
    
    // @Version
    // private Integer version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maCH;

    @Column(columnDefinition = "nvarchar(255)") // với SQL Server
    private String soDT;
    private Timestamp thoigianmoban;

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 Many(this= Cửa hàng)- One(MatHangDuocLuuTru)
    @OneToMany(mappedBy = "cuaHang")
    Set<MatHangDuocLuuTru> listMhdlt= new HashSet<>();
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 Many(this= Cửa hàng)- One(vpdd)
    @ManyToOne
    @JoinColumn(name = "matp")
    private VanPhongDaiDien vpdd;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 



    public CuaHang(Long maCH, String soDT, Timestamp thoigianmoban, VanPhongDaiDien vpdd) {
        this.maCH = maCH;
        this.soDT = soDT;
        this.thoigianmoban = thoigianmoban;
        this.vpdd = vpdd;
    }

    // public CuaHang(Integer version, Long maCH, String soDT, Timestamp thoigianmoban, VanPhongDaiDien vpdd) {
    //     this.version = version;
    //     this.maCH = maCH;
    //     this.soDT = soDT;
    //     this.thoigianmoban = thoigianmoban;
    //     this.vpdd = vpdd;
    // }

    public CuaHang() {
        // ...
    }

    public void updateNotId(CuaHang ch2){
        // this.setMaCH(this.getMaCH());
        this.setSoDT(ch2.getSoDT());
        this.setThoigianmoban(ch2.getThoigianmoban());
        this.setVpdd(ch2.getVpdd());

        // nếu hàm setter là hàm check điều kiện= không dùng trực tiếp
    }
    
    public void appendListMhdlt(List<MatHangDuocLuuTru> listMhdlt2 ){
        this.listMhdlt.addAll(listMhdlt2);
        
        // for(int i=0; i< listMhdlt2.size(); i++ ){
        //     this.listMhdlt.add(listMhdlt2.get(i));
        // }
        // dùng cái này sẽ bị lỗi : https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
    }
}
