package com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Repo.MatHangDuocDat_RepoJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat;
import com.example.demoKDLv1.Layer_Entity.MatHangDuocDat.MatHangDuocDat_Entity.MatHangDuocDat_Key;

@Repository
public interface MatHangDuocDat_Repo 
    extends JpaRepository<MatHangDuocDat, MatHangDuocDat_Key>
{

}

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥 loại key của MatHangDuocDat là class MatHangDuocDat_Key, nếu đổi lại thành Long sẽ gặp lỗi như vừa nói
