package com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Entity.KhachHangBuuDien;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Repo.KhachHangBuuDien_RepoCustom.KhachHangBuuDien_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.KhachHangBuuDien.KhachHangBuuDien_Repo.KhachHangBuuDien_RepoJpa.KhachHangBuuDien_Repo;

@Service
public class KhachHangBuuDien_Service {
    @Autowired
    KhachHangBuuDien_Repo khbd_Repo;

    @Autowired
    KhachHangBuuDien_RepoCustom khbd_RepoCustom;
    
    public KhachHangBuuDien getKhbdById(Long id){
        Optional<KhachHangBuuDien> optionalKhbd1= this.khbd_Repo.findById(id);

        if(optionalKhbd1.isPresent()==false){
            return null;
        }

        return optionalKhbd1.get();
    }

    public KhachHangBuuDien updateKhbdById(Long id, KhachHangBuuDien khbd2){
        KhachHangBuuDien khbd1= this.getKhbdById(id);

        if(khbd1== null){
            return null;
        }

        khbd1.updateNotId(khbd2);

        khbd1= this.khbd_Repo.save(khbd1);

        return khbd1;
    }

    public KhachHangBuuDien createKhbd(Long id, KhachHangBuuDien khbd2){
        // do khbd kế thừa từ khachHang nên không được set null
        khbd2.setMaKH(khbd2.getMaKH());

        khbd2= this.khbd_Repo.save(khbd2);

        return khbd2;
    }

    public Boolean deleteKhbdById(Long id){
        KhachHangBuuDien khbd1= this.getKhbdById(id);

        if(khbd1== null){
            return false;
        }

        this.khbd_Repo.delete(khbd1);

        return true;
    }
    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<KhachHangBuuDien> getListKhbd(Integer sttPage, Integer sizePage){
        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.khbd_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
    
}
