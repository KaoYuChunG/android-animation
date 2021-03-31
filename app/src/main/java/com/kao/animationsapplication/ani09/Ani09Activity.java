package com.kao.animationsapplication.ani09;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.kao.animationsapplication.R;

public class Ani09Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // Hide the status bar.
        setContentView(R.layout.activity_ani09);

    }
}