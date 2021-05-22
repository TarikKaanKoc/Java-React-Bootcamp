package com.company.core.utilitis.results;

public class Result { // Bu class super type - Base class.

    private  boolean success;
    private String message;

    public Result(boolean success){
        this.success = success;
    }
    public Result(boolean success, String message){
        this(success);
        this.message = message;
    }

    public boolean isSuccess(){
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }

}
