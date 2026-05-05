package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat_Key;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Repo.MatHangDuocDat_RepoCustom.MatHangDuocDat_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Repo.MatHangDuocDat_RepoJpa.MatHangDuocDat_Repo;

@Service
public class MatHangDuocDat_Service {
    @Autowired
    MatHangDuocDat_Repo mhdd_Repo;

    @Autowired
    MatHangDuocDat_RepoCustom mhdd_RepoCustom;

    public MatHangDuocDat getMhddById(Long madon, Long mamh){
        MatHangDuocDat_Key mhddKey= new MatHangDuocDat_Key(madon, mamh);

        Optional<MatHangDuocDat> optionalMhdd1= this.mhdd_Repo.findById(mhddKey);
        
        if(optionalMhdd1.isPresent()== false){
            return null;
        }

        return optionalMhdd1.get();
    }

    public MatHangDuocDat updateMhddById(Long madon, Long mamh, MatHangDuocDat mhdd2){

        MatHangDuocDat mhdd1= this.getMhddById(madon, mamh);

        if(mhdd1== null){
            return null;
        }

        mhdd1.updateNotId(mhdd2);

        mhdd1= this.mhdd_Repo.save(mhdd1);

        return mhdd1;
    }

    public MatHangDuocDat createMhdd(MatHangDuocDat mhdd2){
        // A= khóa ngoại+ Id, không set khóa ngoại về null

        mhdd2= this.mhdd_Repo.save(mhdd2);

        return mhdd2;
    }

    public Boolean deleteMhddById(Long madon, Long mamh){
        MatHangDuocDat mhdd1= this.getMhddById(madon, mamh);

        if(mhdd1== null){
            return false;
        }

        this.mhdd_Repo.delete(mhdd1);

        return true;
    }

    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<MatHangDuocDat> getListMhdd(Integer sttPage, Integer sizePage){

        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.mhdd_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
    
    public List<MatHangDuocDat> createAllMhdd(List<MatHangDuocDat> listMhdd){
        listMhdd= this.mhdd_Repo.saveAll(listMhdd);

        return listMhdd;
    }
}
