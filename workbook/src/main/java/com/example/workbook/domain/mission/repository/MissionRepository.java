package com.example.workbook.domain.mission.repository;

import com.example.workbook.domain.mission.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MissionRepository extends JpaRepository<Mission, Long> {

    /*@Query("SELECT s.store_name, m.description, m.deadline " +
            "FROM Mission m " +
            "JOIN m.store_id s " +
            "WHERE m.detailDescription = :address " +
            "AND m.missionId NOT IN (" +
            "    SELECT pm.mission.missionId FROM MemberMission pm WHERE pm.member.id = :memberId" +
            ") " +
            "ORDER BY m.deadline DESC")
    List<Object[]> findAvailableMissions(
            @Param("address") String address,
            @Param("memberId") Long memberId)*/
}
