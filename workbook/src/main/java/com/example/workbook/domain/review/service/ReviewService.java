package com.example.workbook.domain.review.service;

import com.example.workbook.domain.review.entity.Review;
import com.example.workbook.domain.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public List<Review> searchReviewByFilters(Long storeId, Double starRange) {

        List<Review> reviews = reviewRepository.searchReviewsByFilters(storeId, starRange);
        return reviews;
    }
}
