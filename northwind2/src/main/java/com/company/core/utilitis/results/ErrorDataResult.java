package com.company.core.utilitis.results;

public class ErrorDataResult<T> extends DataResult {

    public ErrorDataResult(T data,String message){
        super(data,true,message);
    }

    public ErrorDataResult(T data){
        super(data,true);
    }

    public ErrorDataResult(String message){
        super(null,true,message);
    }

    public  ErrorDataResult(){
        super(null,true);
    }
}
