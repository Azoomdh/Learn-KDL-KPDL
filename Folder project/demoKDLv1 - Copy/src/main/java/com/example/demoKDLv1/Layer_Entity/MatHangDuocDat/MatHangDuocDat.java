package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat;


import java.sql.Timestamp;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatHangDuocDat {

    // @Version
    // private Integer version;

    @EmbeddedId
    private MatHangDuocDat_Key mhddKey= new MatHangDuocDat_Key();

    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 là khóa ngoại và là khóa chính 
    @ManyToOne
    @MapsId("donDatHang_IdEmbedded")
    @JoinColumn(name= "madon")
    private DonDatHang donDatHang;
    // 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩 là khóa ngoại và là khóa chính
    @ManyToOne
    @MapsId("matHang_IdEmbedded")
    @JoinColumn(name= "mamh")
    private MatHang matHang;
    // 🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩
    
    private Integer soluongdat;

    private Long giadat;

    private Timestamp thoigiandat;

    public MatHangDuocDat(DonDatHang donDatHang, MatHang matHang, Integer soluongdat, Long giadat, Timestamp thoigiandat) {
        this.mhddKey= new MatHangDuocDat_Key();
        this.setDonDatHang(donDatHang);
        this.setMatHang(matHang);
        this.soluongdat = soluongdat;
        this.giadat = giadat;
        this.thoigiandat = thoigiandat;
    }

    // public MatHangDuocDat(Integer version, DonDatHang donDatHang, MatHang matHang, Integer soluongdat, Long giadat) {
    //     this.version = version;
    //     this.donDatHang = donDatHang;
    //     this.matHang = matHang;
    //     this.soluongdat = soluongdat;
    //     this.giadat = giadat;
    // }

    // public MatHangDuocDat() {
    //     // ...
    // }

    public void updateNotId(MatHangDuocDat mhdd2){
        // this.setDonDatHang(this.getDonDatHang());
        // this.setMatHang(this.getMatHang());
        this.setSoluongdat(mhdd2.getSoluongdat());
        this.setGiadat(mhdd2.getGiadat());
    }

    public void setDonDatHang(DonDatHang ddh2){
        this.donDatHang= ddh2;
        this.getMhddKey().setDonDatHang_IdEmbedded(ddh2.getMadon());
    }

    public void setMatHang(MatHang mh2){
        this.matHang= mh2;
        this.getMhddKey().setMatHang_IdEmbedded(mh2.getMaMH());
        
    }

    public MatHangDuocDat_Key getMhddKey(){
        return this.mhddKey;
    } 
}
