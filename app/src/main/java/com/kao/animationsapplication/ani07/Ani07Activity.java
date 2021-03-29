package com.kao.animationsapplication.ani07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;
import com.kao.animationsapplication.R;

public class Ani07Activity extends AppCompatActivity {

    private CircleMenu circleMenu;
    private ConstraintLayout constraintLayout;
    private TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani07);

        circleMenu = findViewById(R.id.circle_menu);
        constraintLayout = findViewById(R.id.constrain);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.icon_menu, R.mipmap.icon_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.icon_home)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.icon_search)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.icon_notify)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.icon_setting)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.icon_gps)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        switch (index) {
                            case 0:
                                Toast.makeText(Ani07Activity.this, "home", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#ecfffb"));
                                break;
                            case 1:
                                Toast.makeText(Ani07Activity.this, "search", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#96f7d2"));
                                break;
                            case 2:
                                Toast.makeText(Ani07Activity.this, "notify", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fac4a2"));
                                break;
                            case 3:
                                Toast.makeText(Ani07Activity.this, "setting", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#d3cde6"));
                                break;
                            case 4:
                                Toast.makeText(Ani07Activity.this, "gps", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fff591"));
                                break;
                        }
                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {
                textView1.setTextAppearance(Ani07Activity.this, R.style.TextStyleClose);
                textView2.setTextAppearance(Ani07Activity.this, R.style.TextStyleOpen);
            }

            @Override
            public void onMenuClosed() {
                textView1.setTextAppearance(Ani07Activity.this, R.style.TextStyleOpen);
                textView2.setTextAppearance(Ani07Activity.this, R.style.TextStyleClose);
            }

        });
    }
}

//font https://github.com/Hitomis/CircleMenu