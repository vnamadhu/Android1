package com.felight.myapp2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static android.R.attr.rotation;
import static android.R.attr.translationX;
import static com.felight.myapp2.R.attr.alpha;
import static com.felight.myapp2.R.id.imageView;
import static com.felight.myapp2.R.id.ivResult;

public class AnimationsDemoActivity extends AppCompatActivity {
    private ImageView imageView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_animations_demo);
            imageView =  (ImageView) findViewById(R.id.ivResult);
        }

    public void doAnimation(View v){
        Animation animation = AnimationUtils.loadAnimation(getBaseContext(),R.anim.anim1);
        imageView.startAnimation(animation); //coz im animating the image

        if(v.getId() == R.id.btnRotate){
            ObjectAnimator rotateAnimator = ObjectAnimator.ofFloat(imageView,"rotation", 0,360,0,360,0,90,0,90,0,180,0,180,0);
            rotateAnimator.setDuration(6000);
            rotateAnimator.start();
        }

        if(v.getId() == R.id.btnZoomIn){
            ObjectAnimator moveXAnimator = ObjectAnimator.ofFloat(imageView,"ZoomIn", 0,360,0,360,0,-90,0,90,0,-180,0,180,0,90,-360,0,270);
            moveXAnimator.setDuration(6000);
            moveXAnimator.start();
        }

        if(v.getId() == R.id.btnSlideDown){
            ObjectAnimator moveYAnimator = ObjectAnimator.ofFloat(imageView,"SlideDown", 0,180,0,-360,0,-90,0,90,0,-180,0,180,0,-200,0,-300,20,70,45,0);
            moveYAnimator.setDuration(6000);
            moveYAnimator.start();
        }

        if(v.getId() == R.id.btnBounce) {
            ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 0, 1, 0, .5f, 1, 0, 0.5f, 1, 0, 1);
            alphaAnimator.setDuration(6000);
            alphaAnimator.start();
        }
            if(v.getId() == R.id.btnSlideDown) {
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(imageView, "SlideDown", 0, 1, 0, .5f, 1, 0, 0.5f, 1, 0, 1);
                alphaAnimator.setDuration(6000);
                alphaAnimator.start();
            }
                if(v.getId() == R.id.btnBlink) {
                    ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(imageView, "Blink", 0, 1, 0, .5f, 1, 0, 0.5f, 1, 0, 1);
                    alphaAnimator.setDuration(6000);
                    alphaAnimator.start();
                }
        }
    }

