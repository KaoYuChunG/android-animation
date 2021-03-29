package com.kao.animationsapplication.ani08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.kao.animationsapplication.R;
import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class Ani08Activity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani08);

        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForOnBoarding());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, paperOnboardingFragment);
        fragmentTransaction.commit();
    }

    private ArrayList<PaperOnboardingPage> getDataForOnBoarding() {
        PaperOnboardingPage src1 =  new PaperOnboardingPage("Hotels", "All Hotels",
                Color.parseColor("#ffb174"), R.drawable.hotel,R.drawable.hotel);
        PaperOnboardingPage src2 =  new PaperOnboardingPage("Banks", "All Banks",
                Color.parseColor("#22eaaa"), R.drawable.banks,R.drawable.banks);
        PaperOnboardingPage src3 =  new PaperOnboardingPage("Stores", "All Stores",
                Color.parseColor("#ee5a5a"), R.drawable.store,R.drawable.store);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(src1);
        elements.add(src2);
        elements.add(src3);
        return elements;
    }
}