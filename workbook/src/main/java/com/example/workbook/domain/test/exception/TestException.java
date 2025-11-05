package com.example.workbook.domain.test.exception;

import com.example.workbook.global.apiPayload.code.BaseErrorCode;
import com.example.workbook.global.apiPayload.exception.GeneralException;

public class TestException extends GeneralException {
    public TestException(BaseErrorCode code) {
        super(code);
    }
}
