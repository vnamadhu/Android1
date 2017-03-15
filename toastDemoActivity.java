package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class toastDemoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_demo);

    }


    public void toastMessage(View view){
        switch (view.getId()){
            case R.id.btnTopLeft:

                Toast toast1 = Toast.makeText(getBaseContext(),"Top Left",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP|Gravity.LEFT,130,130);
                toast1.show();
                break;



            case R.id.btnTopRight:
                Toast toast3 = Toast.makeText(getBaseContext(),"Top Right",Toast.LENGTH_SHORT);
                toast3.setGravity(Gravity.TOP | Gravity.RIGHT, 130, 130);
                toast3.show();
                break;



            case R.id.btnCentre:
                Toast toast5 = Toast.makeText(getBaseContext(),"center middle",Toast.LENGTH_SHORT);
                toast5.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast5.show();
                break;


            case R.id.btnBottomLeft:
                Toast toast7 = Toast.makeText(getBaseContext(),"bottom left",Toast.LENGTH_SHORT);
                toast7.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                toast7.show();
                break;

            case R.id.btnBottomRight:
                Toast toast9 = Toast.makeText(getBaseContext(),"bottom right",Toast.LENGTH_SHORT);
                toast9.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                toast9.show();
                break;


        }
    }


}
