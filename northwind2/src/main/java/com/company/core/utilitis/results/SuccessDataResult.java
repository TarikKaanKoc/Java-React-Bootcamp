package com.company.core.utilitis.results;

public class SuccessDataResult<T> extends DataResult{

    public SuccessDataResult(T data,String message){
        super(data,true,message);
    }

    public SuccessDataResult(T data){
        super(data,true);
    }

    public SuccessDataResult(String message){
        super(null,true,message);
    }

    public  SuccessDataResult(){
        super(null,true);
    }
}
