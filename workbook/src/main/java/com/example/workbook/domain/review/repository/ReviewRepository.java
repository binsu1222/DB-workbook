package com.example.workbook.domain.review.repository;

import com.example.workbook.domain.review.ReviewQueryDSL;
import com.example.workbook.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewQueryDSL {
    @Query("SELECT m.name, r.content, r.stars, r.createdAt " +
            "FROM Review r " +
            "JOIN r.member m " +
            "WHERE r.store.storeId = :storeId " +
            "ORDER BY r.createdAt DESC")
    List<Object[]> findReviewByStoreId(@Param("storeId") Long storeId);

    }
