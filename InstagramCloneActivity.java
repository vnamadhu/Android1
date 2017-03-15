package com.felight.myapp2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.felight.myapp2.img.ImageFilter;

public class InstagramCloneActivity extends AppCompatActivity {

        private ImageView ivResult;

        public Bitmap toGrayscale(Bitmap bmpOriginal) {
            int width, height;
            height = bmpOriginal.getHeight();
            width = bmpOriginal.getWidth();

            Bitmap bmpGrayscale = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            Canvas c = new Canvas(bmpGrayscale);
            Paint paint = new Paint();
            ColorMatrix cm = new ColorMatrix();
            cm.setSaturation(0);
            ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
            paint.setColorFilter(f);
            c.drawBitmap(bmpOriginal, 0, 0, paint);
            return bmpGrayscale;
        }

        public Bitmap toSepiaNice(Bitmap color) {
            int red, green, blue, pixel, gry;
            int height = color.getHeight();
            int width = color.getWidth();
            int depth = 20;

            Bitmap sepia = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            int[] pixels = new int[width * height];
            color.getPixels(pixels, 0, width, 0, 0, width, height);
            for (int i = 0; i < pixels.length; i++) {
                pixel = pixels[i];

                red = (pixel >> 16) & 0xFF;
                green = (pixel >> 8) & 0xFF;
                blue = pixel & 0xFF;

                red = green = blue = (red + green + blue) / 3;

                red += (depth * 2);
                green += depth;

                if (red > 255)
                    red = 255;
                if (green > 255)
                    green = 255;
                pixels[i] = (0xFF << 24) | (red << 16) | (green << 8) | blue;
            }
            sepia.setPixels(pixels, 0, width, 0, 0, width, height);
            return sepia;
        }


        public Bitmap toRed(Bitmap color) {
            int red, green, blue, pixel, gry;
            int height = color.getHeight();
            int width = color.getWidth();
            int depth = 20;

            Bitmap reds = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            int[] pixels = new int[width * height];
            color.getPixels(pixels, 0, width, 0, 0, width, height);
            for (int i = 0; i < pixels.length; i++) {
                pixel = pixels[i];

                red = (pixel >> 40) & 0xFF;
                green = (pixel >> 0) & 0xFF;
                blue = pixel & 0xFF;

                red = green = blue = (red);

                red += (depth * 8);
                green += depth;

                if (red > 255)
                    red = 255;
                if (green > 255)
                    green = 255;
                pixels[i] = (0xFF << 24) | (red << 16) | (green << 8) | blue;
            }
            reds.setPixels(pixels, 0, width, 0, 0, width, height);
            return reds;
        }


        public Bitmap toGreen(Bitmap color) {
            int red, green, blue, pixel, gry;
            int height = color.getHeight();
            int width = color.getWidth();
            int depth = 20;

            Bitmap greens = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            int[] pixels = new int[width * height];
            color.getPixels(pixels, 0, width, 0, 0, width, height);
            for (int i = 0; i < pixels.length; i++) {
                pixel = pixels[i];

                red = (pixel >> 40) & 0xFF;
                green = (pixel >> 0) & 0xFF;
                blue = pixel & 0xFF;

                red = green = blue = (green);

                red += (depth * 1);
                green += (depth * 8);

                if (red > 255)
                    red = 255;
                if (green > 255)
                    green = 255;
                pixels[i] = (0xFF << 24) | (red << 16) | (green << 8) | blue;
            }
            greens.setPixels(pixels, 0, width, 0, 0, width, height);
            return greens;
        }


        public Bitmap toBlue(Bitmap color) {
            int red, green, blue, pixel, gry;
            int height = color.getHeight();
            int width = color.getWidth();
            int depth = 20;

            Bitmap blues = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            int[] pixels = new int[width * height];
            color.getPixels(pixels, 0, width, 0, 0, width, height);
            for (int i = 0; i < pixels.length; i++) {
                pixel = pixels[i];

                red = (pixel >> 40) & 0xFF;
                green = (pixel >> 0) & 0xFF;
                blue = (pixel>>40) & 0xFF;

                red = green = blue = (green);

                red += (depth * 1);
                green += (depth * 1);
                blue +=(depth*8);

                if (red > 255)
                    red = 255;
                if (green > 255)
                    green = 255;
                pixels[i] = (0xFF << 24) | (red << 16) | (green << 8) | blue;
            }
            blues.setPixels(pixels, 0, width, 0, 0, width, height);
            return blues;
        }



        public void doConversion(View view) {
            switch (view.getId()) {
                case R.id.ivGrayscale:
                    ivResult.buildDrawingCache();
                    Bitmap bm = ivResult.getDrawingCache();
                    bm = toGrayscale(bm);
                    ivResult.setImageBitmap(bm);
                    break;
                case R.id.ivSophia:
                    ivResult.buildDrawingCache();
                    bm = ivResult.getDrawingCache();
                    bm = toSepiaNice(bm);
                    ivResult.setImageBitmap(bm);
                    break;
                case R.id.ivRed:
                    ivResult.buildDrawingCache();
                    bm = ivResult.getDrawingCache();
                    bm = toRed(bm);
                    ivResult.setImageBitmap(bm);
                    break;
                case R.id.ivGreen:
                    ivResult.buildDrawingCache();
                    bm = ivResult.getDrawingCache();
                    bm = toGreen(bm);
                    ivResult.setImageBitmap(bm);
                    break;
                case R.id.ivBlue:
                    ivResult.buildDrawingCache();
                    bm = ivResult.getDrawingCache();
                    bm = toBlue(bm);
                    ivResult.setImageBitmap(bm);
                    break;

            }
        }

        static final int REQUEST_IMAGE_CAPTURE = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_instagram_clone);
            ivResult = (ImageView) findViewById(R.id.ivResult);
            initializeImage();
        }

    public void  initializeImage(){
        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();

        if(Intent.ACTION_SEND.equals(action) && type!=null){
            if(type.startsWith("image/")){
                Uri imageuri=(Uri)intent.getParcelableExtra(Intent.EXTRA_STREAM);
                if(imageuri!=null){
                    ivResult.setImageURI(imageuri);
                }
            }
        }
    }


        public void dispatchTakePictureIntent(View view) {
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                ivResult.setImageBitmap(imageBitmap);
            }
        }
    }