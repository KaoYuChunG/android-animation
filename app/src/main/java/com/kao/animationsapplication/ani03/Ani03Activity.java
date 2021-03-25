package com.kao.animationsapplication.ani03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kao.animationsapplication.R;

public class Ani03Activity extends AppCompatActivity {

    private ImageView imageView;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani03);
        isChecked = true;

        imageView = findViewById(R.id.avdImage);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChecked)
                    checkToClose();

                else
                    closeToCheck();

                isChecked = !isChecked;
            }
        });
    }

    private void closeToCheck() {
        imageView.setImageResource(R.drawable.avd_close_to_check);
        AnimatedVectorDrawable avdCloseToCheck = (AnimatedVectorDrawable) imageView.getDrawable();
        avdCloseToCheck.start();
        toast("close To Check",R.drawable.ic_close_24);
    }

    private void checkToClose() {
        imageView.setImageResource(R.drawable.avd_check_to_close);
        AnimatedVectorDrawable avdCheckToClose = (AnimatedVectorDrawable) imageView.getDrawable();
        avdCheckToClose.start();
        toast("check To Close",R.drawable.ic_check_24 );
    }

    private void toast(String content, int drawable) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        TextView text = layout.findViewById(R.id.toast_text);
        ImageView image = layout.findViewById(R.id.toast_image);

        text.setText(content);
        image.setImageResource(drawable);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }
}