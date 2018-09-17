package com.example.wilcom1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.okta.appauth.android.OktaAppAuth;
import net.openid.appauth.AuthorizationException;

public class LoginActivity extends Activity{
    private OktaAppAuth mOktaAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mOktaAuth = OktaAppAuth.getInstance(this);

        mOktaAuth.init(
            this,
            new OktaAppAuth.OktaAuthListener(){
                @Override
                public void onSuccess(){

                }

                @Override
                public void onTokenFailure(@NonNull AuthorizationException ex){

                }
            }
        );
    }
}