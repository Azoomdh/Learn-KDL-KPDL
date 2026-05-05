package com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Entity.DonDatHang;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoCustom.DonDatHang_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.DonDatHang.DonDatHang_Repo.DonDatHang_RepoJpa.DonDatHang_Repo;

@Service
public class DonDatHang_Service {
    @Autowired
    DonDatHang_Repo ddh_Repo;

    @Autowired
    DonDatHang_RepoCustom ddh_RepoCustom;
    
    public DonDatHang getCuahangById(Long id){
        Optional<DonDatHang> optionalDondathang1= this.ddh_Repo.findById(id);

        if(optionalDondathang1.isPresent()== false){
            return null;
        }

        return optionalDondathang1.get();
    }

    public DonDatHang updateDondathangById(Long id, DonDatHang ddh2){

        DonDatHang ddh1= this.getCuahangById(id);

        if(ddh1== null){
            return null;
        }

        ddh1.updateNotId(ddh2);

        ddh1= this.ddh_Repo.save(ddh1);

        return ddh1;
    }

    public DonDatHang createDondathang(DonDatHang ddh2){
        ddh2.setMadon(null);

        ddh2= this.ddh_Repo.save(ddh2);

        return ddh2;
    }

    public List<DonDatHang> createDondathang(List<DonDatHang> listDdh2){
        for(DonDatHang ddh : listDdh2 ){
            ddh.setMadon(null);
        }

        listDdh2 = this.ddh_Repo.saveAll(listDdh2);

        return listDdh2;
    }

    public Boolean deleteDondathangById(Long id){

        DonDatHang ddh1= this.getCuahangById(id);

        if(ddh1== null){
            return false;
        }

        this.ddh_Repo.delete(ddh1);

        return true;
    }
    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<DonDatHang> getListDondathang(Integer sttPage, Integer sizePage){
        
        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.ddh_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸


}
