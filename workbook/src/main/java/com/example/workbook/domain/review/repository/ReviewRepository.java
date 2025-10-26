package com.example.workbook.domain.review.repository;

import com.example.workbook.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query(value = "SELECT m.name AS member_name, r.content, r.star, r.created_at FROM review r " +
            "JOIN member m ON r.member_id = m.member_id WHERE r.store_id = :storeId", nativeQuery = true)
    List<Object[]> findReviewByStoreId(@Param("storeId") Long storeId);

    }
