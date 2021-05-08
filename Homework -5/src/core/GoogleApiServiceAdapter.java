package core;

import googleApi.GoogleApiService;

public class GoogleApiServiceAdapter {
    public void signWithGoogle(String email,String password){
        GoogleApiService api = new GoogleApiService();
        api.sign(email,password);
    }
}
