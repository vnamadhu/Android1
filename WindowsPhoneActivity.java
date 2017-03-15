package com.felight.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WindowsPhoneActivity extends AppCompatActivity {

    public void LaunchActivity(View view){

        switch(view.getId()){
            case R.id.btnAlgo:
                Intent intentAlgo=new Intent(this,AlgoBenchmarkingActivity.class);
                startActivity(intentAlgo);
                break;

            case R.id.btnLifeCycle:
                Intent intentCycle=new Intent(this,ActivityLifeCycleDemo.class);
                startActivity(intentCycle);
                break;

            case R.id.btnNavigator:
                Intent intentNavigator=new Intent(this,ActivityNavigator.class);
                startActivity(intentNavigator);
                break;

            case R.id.btnPassData:
                Intent intentPassData=new Intent(this,PassDataActivity.class);
                startActivity(intentPassData);
                break;

            case R.id.btnConverter:
                Intent intentConverter=new Intent(this,currencyconverterActivity.class);
                startActivity(intentConverter);
                break;

            case R.id.btnGreet:
                Intent intentGreet=new Intent(this,GreetUserActivity.class);
                startActivity(intentGreet);
                break;

            case R.id.btnCalcu:
                Intent intentCalci=new Intent(this,SimpleCalculatorActivity.class);
                startActivity(intentCalci);
                break;

            case R.id.btnInsta:
                Intent intentInsta=new Intent(this,GrayscaleActivity.class);
                startActivity(intentInsta);
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows_phone);
    }
}
