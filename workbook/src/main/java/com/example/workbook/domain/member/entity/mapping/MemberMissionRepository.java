package com.example.workbook.domain.member.entity.mapping;

import com.example.workbook.domain.member.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long>{

    @Query("SELECT m.point, m.description, m.description " +
            "FROM MemberMission p " +
            "JOIN p.mission m " +
            "WHERE p.id = :memberId AND p.status = :status " +
            "ORDER BY p.createdAt DESC")
    List<Object[]> findMemberMissionsByStatus(
            @Param("memberId") Long memberId,
            @Param("status") Status status);
}
