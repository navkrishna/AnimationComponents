package com.intelligrape.animationcomponents;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;


public class MyActivity extends ActionBarActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        layout = (LinearLayout) findViewById(R.id.llComponent);

        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                start();
            }
        }, 5000);
    }

    void start() {
        layout.clearAnimation();
        layout.setVisibility(View.VISIBLE);

        TranslateAnimation translation;
        translation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, -1.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        translation.setStartOffset(0);
        translation.setDuration(5000);
        translation.setFillAfter(true);
        translation.setInterpolator(new BounceInterpolator());

        translation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        layout.startAnimation(translation);
    }

}