# Android1
Animation_Android
Activity:
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

Layout:
<?xml version="1.0" encoding="UTF-8"?>

-<RelativeLayout tools:context="com.felight.myapp2.AnimationsDemoActivity" android:paddingTop="@dimen/activity_vertical_margin" android:paddingRight="@dimen/activity_horizontal_margin" android:paddingLeft="@dimen/activity_horizontal_margin" android:paddingBottom="@dimen/activity_vertical_margin" android:layout_height="match_parent" android:layout_width="match_parent" android:id="@+id/activity_animations_demo" xmlns:tools="http://schemas.android.com/tools" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:android="http://schemas.android.com/apk/res/android">

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnRotate" android:text="Rotate" android:onClick="doAnimation"/>

<ImageView android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/ivResult" android:layout_marginTop="34dp" android:layout_centerHorizontal="true" android:layout_below="@+id/btnRotate" app:srcCompat="@drawable/sharukh"/>

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnFadeIn" android:text="FadeIn" android:onClick="doAnimation" android:layout_marginTop="49dp" android:layout_below="@+id/ivResult" android:layout_alignParentStart="true" android:layout_alignParentLeft="true"/>

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnZoomIn" android:text="ZoomIn" android:onClick="doAnimation" android:layout_marginBottom="20dp" android:layout_toEndOf="@+id/btnFadeIn" android:layout_toRightOf="@+id/btnFadeIn" android:layout_alignParentBottom="true"/>

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnBounce" android:text="Bounce" android:onClick="doAnimation" android:layout_marginEnd="15dp" android:layout_marginRight="15dp" android:layout_alignParentEnd="true" android:layout_alignParentRight="true" android:layout_alignParentTop="true"/>

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnBlink" android:text="Blink" android:onClick="doAnimation" android:layout_alignEnd="@+id/ivResult" android:layout_alignRight="@+id/ivResult" android:layout_alignBottom="@+id/btnFadeIn" android:layout_alignBaseline="@+id/btnFadeIn"/>

<Button android:layout_height="wrap_content" android:layout_width="wrap_content" android:id="@+id/btnSlideDown" android:text="SlideDown" android:onClick="doAnimation" android:layout_centerHorizontal="true" android:layout_alignParentTop="true"/>

</RelativeLayout>
