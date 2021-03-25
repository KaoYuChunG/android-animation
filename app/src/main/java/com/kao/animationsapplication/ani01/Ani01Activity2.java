package com.kao.animationsapplication.ani01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import com.kao.animationsapplication.R;

public class Ani01Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani012);

        setTitle("Animation 01-02");

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
//        fade.excludeTarget(decor.findViewById(R.id.action_bar_container));
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }
}