package com.kao.animationsapplication.ani04;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.kao.animationsapplication.R;

public class Ani04Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani042);
        setTitle("Activity 4-2");
    }

    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(Ani04Activity2.this); //fire the slide left animation}
    }
}