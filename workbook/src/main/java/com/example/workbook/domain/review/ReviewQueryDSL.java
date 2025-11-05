package com.example.workbook.domain.review;

import com.example.workbook.domain.review.entity.Review;

import java.util.List;
import com.querydsl.core.types.Predicate;
import org.springframework.data.repository.query.Param;

public interface ReviewQueryDSL {
    List<Review> searchReview(Predicate predicate);

    List<Review> searchReviewsByFilters(Long storeId, Double starRange);
    }
