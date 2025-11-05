package com.example.workbook.domain.review;

import com.example.workbook.domain.review.entity.QReview;
import com.example.workbook.domain.review.entity.Review;
import com.example.workbook.domain.review.repository.ReviewRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import com.querydsl.core.types.Predicate;

import static com.example.workbook.domain.review.entity.QReview.review;

@Service
@RequiredArgsConstructor
public class ReviewQueryDSLImpl implements ReviewQueryDSL {
    private final EntityManager em;

    private final QReview qReview =  review;


    @Override
    public List<Review> searchReviewsByFilters (Long storeId, Double starRange) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(review.store.storeId.eq(storeId));

        if(starRange != null){
            builder.and(review.stars.eq(5));
        }
        else {
            int floorStar = starRange.intValue();
            builder.and(review.stars.goe(floorStar).and(review.stars.lt(floorStar + 1)));
        }
        return queryFactory.selectFrom(review).where(builder).fetch();
    }

    public List<Review> searchReview(
            Predicate predicate) {

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        QReview review = QReview.review;

        return queryFactory.selectFrom(review).where(predicate).fetch();
    }


    }
