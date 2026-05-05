package com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoCustom.CuaHang_RepoCustom;
import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoJpa.CuaHang_Repo;

@Service
public class CuaHang_Service {
    
    @Autowired
    CuaHang_Repo ch_Repo;

    @Autowired
    CuaHang_RepoCustom ch_RepoCustom;

    public CuaHang getCuahangById(Long id){
        Optional<CuaHang> optionCuahang1= ch_Repo.findById(id);

        if(optionCuahang1.isPresent()== false){
            return null;
        }

        return optionCuahang1.get();
    }

    public CuaHang updateCuahangById(Long id, CuaHang ch2){
        CuaHang ch1= this.getCuahangById(id);

        if(ch1== null){
            return null;
        }

        // ch2.setMaCH(id); set thuộc tính của ch1 có lẽ tốt hơn hơn set id của ch2; hàm set của server sẽ check ràng buộc

        ch1.updateNotId(ch2);

        ch1= this.ch_Repo.save(ch1);

        return ch1;

    }

    // gpt: Việc các hàm gọi nhau trong một service là bình thường và thậm chí là cần thiết trong nhiều trường hợp. Tuy nhiên, bạn cần chú ý đến việc tổ chức mã sao cho dễ hiểu, dễ bảo trì và không gây ra sự phụ thuộc không cần thiết.
    // không cần dùng optional và repo
    // dùng hàm update của Entity để giảm phức tạp

    public CuaHang createCuaHang(CuaHang ch2){
        ch2.setMaCH(null);

        ch2= this.ch_Repo.save(ch2);

        return ch2;
    }

    public Boolean deleteCuaHangById(Long id){

        CuaHang cuahang1= this.getCuahangById(id);

        if(cuahang1== null){
            return false;
        }

        this.ch_Repo.delete(cuahang1);

        return true;
    }
    // 🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹

    public Page<CuaHang> getListCuahang(Integer sttPage, Integer sizePage){
        Pageable pageable1= PageRequest.of(sttPage, sizePage);

        return this.ch_Repo.findAll(pageable1);
    }
    // 🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
}
