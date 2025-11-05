package com.example.workbook.domain.review.controller;

import com.example.workbook.domain.review.entity.Review;
import com.example.workbook.domain.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/reviews/search")
    @ResponseBody
    public List<Review> searchReview(@RequestParam("storeId") Long storeId,
                                     @RequestParam("starRange") Double starRange) {
        return reviewService.searchReviewByFilters(storeId, starRange);
    }
}
