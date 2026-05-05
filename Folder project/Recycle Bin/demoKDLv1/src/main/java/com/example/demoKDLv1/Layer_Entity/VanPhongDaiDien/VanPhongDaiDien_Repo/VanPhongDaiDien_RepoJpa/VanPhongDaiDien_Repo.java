package com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Repo.VanPhongDaiDien_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.VanPhongDaiDien.VanPhongDaiDien_Entity.VanPhongDaiDien;

@Repository
public interface VanPhongDaiDien_Repo 
    extends JpaRepository<VanPhongDaiDien, Long>
{

}
