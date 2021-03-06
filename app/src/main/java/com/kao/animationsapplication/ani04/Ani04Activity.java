package com.kao.animationsapplication.ani04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.kao.animationsapplication.MainActivity;
import com.kao.animationsapplication.R;

public class Ani04Activity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    Button button11,button12,button13,button14,button15;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani04);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
            }
        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateInAndOut(Ani04Activity.this);
            }
        });


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSwipeLeft(Ani04Activity.this);
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSwipeRight(Ani04Activity.this);
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSplit(Ani04Activity.this);
            }
        });


        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateShrink(Ani04Activity.this);
            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateCard(Ani04Activity.this);
            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateZoom(Ani04Activity.this);
            }
        });


        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateFade(Ani04Activity.this);
            }
        });


        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSpin(Ani04Activity.this);
            }
        });

        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateDiagonal(Ani04Activity.this);
            }
        });

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateWindmill(Ani04Activity.this);
            }
        });

        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSlideUp(Ani04Activity.this);
            }
        });


        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSlideDown(Ani04Activity.this);
            }
        });

        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSlideLeft(Ani04Activity.this);
            }
        });


        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Ani04Activity.this, Ani04Activity2.class);
                startActivity(in);
                Animatoo.animateSlideRight(Ani04Activity.this);
            }
        });
    }
}