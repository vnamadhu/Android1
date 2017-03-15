package com.felight.myapp2;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class GreetUserActivity extends AppCompatActivity {
    private static final String TAG = GreetUserActivity.class.getSimpleName();
    private EditText etFirstName;
    private EditText etLastName;
    private TextView tvResult;



    public void greetUser(View view) {
        Log.i(TAG, "inside greet user method");
        String fname = etFirstName.getText().toString();
        String lname = etLastName.getText().toString();

        tvResult.setText("Greetings"+ " "+fname+" " +lname);

        Log.i(TAG, fname+ " "+lname);

        Toast.makeText(getBaseContext(), "Greetings"+ " "+fname+" " +lname,Toast.LENGTH_LONG).show();


    }
@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    setContentView(R.layout.greet_user_layout);


    etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }
}
