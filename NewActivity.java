package com.felight.myapp2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Madhu on 29-Dec-16.
 */

public class NewActivity extends AppCompatActivity {

    public void doSomething(View view){
        TextView textview= (TextView) findViewById(R.id.tvResult);
        textview.setText("This is from a Java program");
        textview.setTextColor(Color.BLUE);
        textview.setTextSize(50.5F);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity_layout);


    }
}
