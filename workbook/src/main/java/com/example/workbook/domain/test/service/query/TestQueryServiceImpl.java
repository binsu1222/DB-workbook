package com.example.workbook.domain.test.service.query;

import com.example.workbook.domain.test.exception.TestException;
import com.example.workbook.domain.test.exception.code.TestErrorCode;

public class TestQueryServiceImpl implements TestQueryService {
    @Override
    public void checkFlag(Long flag) {
        if (flag == 1) {
            throw new TestException(TestErrorCode.TEST_EXCEPTION);
        }
    }
}
