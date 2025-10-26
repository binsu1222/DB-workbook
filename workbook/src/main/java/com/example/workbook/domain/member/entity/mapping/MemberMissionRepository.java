package com.example.workbook.domain.member.entity.mapping;

import com.example.workbook.domain.member.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {

    @Query("SELECT pm.point, pm.description, m.description" +
            "FROM MemberMission pm " +
            "JOIN pm.mission m " +
            "WHERE pm.member.id = :memberId AND pm.status = :status " +
            "ORDER BY pm.createdAt DESC")
    List<Object[]> findMemberMissionsByStatus(
            @Param("memberId") Long memberId,
            @Param("status") Status status);
}
