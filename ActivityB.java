package com.felight.myapp2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    public static final String DEFAULT ="N/A";
    TextView userNameTextView,passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        userNameTextView=(TextView) findViewById(R.id.textView2);
        passwordTextView=(TextView) findViewById(R.id.textView4);
    }

    public void load(View view){

        SharedPreferences sharedPreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name",DEFAULT);
        String password=sharedPreferences.getString("password",DEFAULT);

        if(name.equals(DEFAULT) || password.equals(DEFAULT)){
            Toast.makeText(this,"No data found",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Data loaded successfully",Toast.LENGTH_LONG).show();
            userNameTextView.setText(name);
            passwordTextView.setText(password);
        }

    }

    public void previous(View view){

            Toast.makeText(this,"previous",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,SharedPreferencesActivity.class);
            startActivity(intent);
        }
}
