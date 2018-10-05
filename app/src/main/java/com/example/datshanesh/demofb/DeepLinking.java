package com.example.datshanesh.demofb;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.facebook.FacebookSdk;

import bolts.AppLinks;

public class DeepLinking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FacebookSdk.setApplicationId("2100505106945131");
        FacebookSdk.sdkInitialize(this);
        System.out.println(FacebookSdk.isInitialized());*/
    }
}