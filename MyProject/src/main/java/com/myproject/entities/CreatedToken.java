package com.myproject.entities;

public class CreatedToken {
    private final String token;

    public String getToken(){
        return token;
    }
    public CreatedToken(String token){
        this.token=token;
    }
}
