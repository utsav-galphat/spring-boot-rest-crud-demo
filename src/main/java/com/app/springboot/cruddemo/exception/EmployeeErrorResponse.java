package com.app.springboot.cruddemo.exception;

import lombok.Getter;
import lombok.Setter;

public class EmployeeErrorResponse {
    @Getter
    @Setter
    private int status;

    @Getter @Setter
    private String message;

    @Getter @Setter
    private long timeStamp;

    public EmployeeErrorResponse() {

    }

    public EmployeeErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
