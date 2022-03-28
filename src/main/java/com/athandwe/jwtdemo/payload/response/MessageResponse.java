package com.athandwe.jwtdemo.payload.response;

public class MessageResponse {
    private String message;
    private String statusCode;
    private Object results;

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(String message, String statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public MessageResponse(String message, Object results) {
        this.message = message;
        this.results = results;
    }

    public MessageResponse(Object results) {
        this.results = results;
    }

    public MessageResponse(String message, String statusCode, Object results) {
        this.message = message;
        this.statusCode = statusCode;
        this.results = results;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }
}
