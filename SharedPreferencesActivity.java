package com.felight.myapp2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {
    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        userName=(EditText) findViewById(R.id.userName);
        password=(EditText) findViewById(R.id.password);
    }

    public void save(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",userName.getText().toString());
        editor.putString("password",password.getText().toString());

        editor.commit();

        Toast.makeText(this,"Data got saved successfully",Toast.LENGTH_LONG).show();
    }

    public void next(View view){

        Toast.makeText(this,"next",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);
    }
}
