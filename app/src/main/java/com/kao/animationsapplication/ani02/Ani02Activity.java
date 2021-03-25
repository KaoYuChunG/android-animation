package com.kao.animationsapplication.ani02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;

import com.kao.animationsapplication.R;

public class Ani02Activity extends AppCompatActivity {

    private Scene scene1;
    private Scene scene2;
    private Scene currentScene;
    private Transition transition;
    private ViewGroup sceneRootFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani02);

//         Step 1: Create a Scene object for both the starting and ending layout
        sceneRootFrameLayout = (ViewGroup) findViewById(R.id.sceneRootFrameLayout);
        scene1 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scena1, this);
        scene2 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scena2, this);

        scene1.enter();
        currentScene = scene1;
//       usa examples to test they are 4 examples
        transition = TransitionInflater.from(this).inflateTransition(R.transition.example_4);
    }

    public void onClick(View view) {
        // Step 3: Call TransitionManager.go() to run animation
        if (currentScene == scene1) {
            TransitionManager.go(scene2, transition);
            currentScene = scene2;
        } else {
            TransitionManager.go(scene1, transition);
            currentScene = scene1;
        }
    }
}