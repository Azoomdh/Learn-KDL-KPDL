package com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Repo.MatHangDuocLuuTru_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocLuuTru.MatHangDuocLuuTru_Entity.MatHangDuocLuuTru_Key;

@Repository
public interface MatHangDuocLuuTru_Repo 
    extends JpaRepository<MatHangDuocLuuTru, MatHangDuocLuuTru_Key>
{

}