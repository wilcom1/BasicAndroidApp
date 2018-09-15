package com.example.wilcom1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.okta.appauth.android.OktaAppAuth;
import net.openid.appauth.AuthorizationException;

public class LoginActivity extends Activity{
    private OktAppAuth mOktaAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
}