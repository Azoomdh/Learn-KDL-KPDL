package com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Entity.KhachHang;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoCustom.KhachHang_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.KhachHang.KhachHang_Repo.KhachHang_RepoJpa.KhachHang_Repo;

@Service
public class KhachHang_Service {
    @Autowired
    private KhachHang_Repo kh_Repo;

    @Autowired
    private KhachHang_RepoCustom kh_RepoCustom;

    public KhachHang getKhachhangById(Long id){
        Optional<KhachHang> optionalKhachhang1= this.kh_Repo.findById(id);

        if(optionalKhachhang1.isPresent()== false){
            return null;
        }

        return optionalKhachhang1.get();
    }

    public KhachHang updateKhachhangById(Long id, KhachHang kh2){
        KhachHang kh1= this.getKhachhangById(id);

        if(kh1== null){
            return null;
        }

        kh1.updateNotId(kh2);

        kh1= this.kh_Repo.save(kh1);

        return kh1;
    }

    public KhachHang createKhachhang(KhachHang kh2){
        kh2.setMaKH(null);

        kh2= this.kh_Repo.save(kh2);

        return kh2;
    }

    public List<KhachHang> createKhachHang(List<KhachHang> listKh1){
        for(KhachHang kh1 : listKh1){
            kh1.setMaKH(null);
        }

        listKh1 = this.kh_Repo.saveAll(listKh1);

        return listKh1;
    }

    public Boolean deleteKhachhangById(Long id){
        
        KhachHang kh1= this.getKhachhangById(id);

        if(kh1== null){
            return false;
        }

        this.kh_Repo.delete(kh1);

        return true;
    }
    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<KhachHang> getListKhachhang(Integer sttPage, Integer sizePage){
        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.kh_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸

    public List<KhachHang> getRandomKhachhang(Integer soLuong){
        List<KhachHang> listKhachhang= this.kh_RepoCustom.getRandomKhachhang(soLuong);

        return listKhachhang;
    }
}
