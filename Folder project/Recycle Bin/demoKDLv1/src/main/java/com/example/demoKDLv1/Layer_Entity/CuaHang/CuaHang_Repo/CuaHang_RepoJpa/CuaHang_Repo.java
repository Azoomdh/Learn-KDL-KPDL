package com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Repo.CuaHang_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.CuaHang.CuaHang_Entity.CuaHang;

@Repository
public interface CuaHang_Repo 
    extends JpaRepository<CuaHang, Long>
{
    
}
