package com.example.todolist.helpers;


public class Response {

    private boolean isSuccess;
    private String message;
    private int errorCode;
    private Exception exception;
    private Object object;

    public Response(){
    }

    public Response(boolean isSuccess, String message, int errorCode, Exception exception, Object object) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.errorCode = errorCode;
        this.exception = exception;
        this.object = object;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
