package com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Entity.KhachHangDuLich;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Repo.KhachHangDuLich_RepoCustom.KhachHangDuLich_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.KhachHangDuLich.KhachHangDuLich_Repo.KhachHangDuLich_RepoJpa.KhachHangDuLich_Repo;

@Service
public class KhachHangDuLich_Service {
    @Autowired
    KhachHangDuLich_Repo khdl_Repo;

    @Autowired
    KhachHangDuLich_RepoCustom khdl_RepoCustom;

    public KhachHangDuLich getKhdlById(Long id){
        Optional<KhachHangDuLich> optionalKhdl1= this.khdl_Repo.findById(id);

        if(optionalKhdl1.isPresent()== false){
            return null;
        }

        return optionalKhdl1.get();
    }

    public KhachHangDuLich updateKhdlById(Long id, KhachHangDuLich khdl2){

        KhachHangDuLich khdl1= this.getKhdlById(id);

        if(khdl1== null){
            return null;
        }

        khdl1.updateNotId(khdl2);

        khdl1= this.khdl_Repo.save(khdl1);

        return khdl1;
    }

    public KhachHangDuLich createKhdl(KhachHangDuLich khdl2){
        // khdl kế thừa từ KhachHang, KhachHang != null 
        khdl2.setMaKH(khdl2.getMaKH());

        khdl2= this.khdl_Repo.save(khdl2);

        return khdl2;
    }

    public Boolean deleteKhdlById(Long id){
        KhachHangDuLich khdl1= this.getKhdlById(id);

        if(khdl1== null){
            return false;
        }

        this.khdl_Repo.delete(khdl1);

        return true;
    }

    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<KhachHangDuLich> getListKhdl(Integer sttPage, Integer sizePage){

        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.khdl_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
    
}
