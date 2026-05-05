package com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Repo.MatHang_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.MatHang.MatHang_Entity.MatHang;

@Repository
public interface MatHang_Repo 
    extends JpaRepository<MatHang, Long>
{

}
