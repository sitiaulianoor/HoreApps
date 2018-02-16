package com.example.awl.horeapps;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}
