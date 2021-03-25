package com.kao.animationsapplication.ani01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kao.animationsapplication.R;

public class Ani01Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation01);

        setTitle("Animation 01-01");

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
//        fade.excludeTarget(decor.findViewById(R.id.action_bar_container));
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
        final ImageView imageView = findViewById(R.id.img_1);

        Button button = findViewById(R.id.btn_01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ani01Activity.this, Ani01Activity2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(Ani01Activity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
            }
        });
    }
}