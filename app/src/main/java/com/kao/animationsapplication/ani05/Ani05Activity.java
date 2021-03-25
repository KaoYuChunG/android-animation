package com.kao.animationsapplication.ani05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kao.animationsapplication.MainActivity;
import com.kao.animationsapplication.R;

public class Ani05Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani05);

        final FloatingActionButton button = findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Ani05Activity.this,  Ani05Activity2.class));
            }

        });

    }
}