package com.example.workbook.global.apiPayload.code;

import org.springframework.http.HttpStatus;

public enum GeneralSuccessCode implements  BaseSuccessCode {

    // 200 OK: 일반적인 성공
    OK(HttpStatus.OK, "COMMON200", "요청 성공"),

    // 201 Created: 리소스 생성 성공
    CREATED(HttpStatus.CREATED, "COMMON201", "리소스 생성 성공"),

    // 204 No Content: 응답할 내용이 없지만 성공 (예: 삭제 성공)
    NO_CONTENT(HttpStatus.NO_CONTENT, "COMMON204", "내용 없음");

    private final HttpStatus status;
    private final String code;
    private final String message;

    GeneralSuccessCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
