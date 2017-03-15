package com.felight.myapp2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegistrationActivity extends AppCompatActivity {
    private Button btn;
    private EditText etEmail;
    int year_x,month_x,day_x;
    static final int DIALOG_ID=0;
    private TextView tvDate;
    private EditText emailValidate;
    //private TextView textView;
    private String email;
    private String emailPattern;
    private EditText etPhone;
    private EditText etPsw;
    private EditText etRPsw;

    public void isValidMail(View view) {

        String number = etPhone.getText().toString();
        if(number != null && number.matches("[0-9]{10}")){
            Toast.makeText(getApplicationContext(),"Valid Mobile Number",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Enter 10 digit mobile Number",Toast.LENGTH_LONG).show();
        }

        email = emailValidate.getText().toString().trim();
        emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (email.matches(emailPattern)) {
            Toast.makeText(getApplicationContext(), "valid email address", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_LONG).show();
        }

        String Psw=etPsw.getText().toString();
        String RPsw=etRPsw.getText().toString();
        Pattern pattern = Pattern.compile(Psw, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(RPsw);

        if (!matcher.matches()) {
            Toast.makeText(getApplicationContext(), "Re-enter the Password", Toast.LENGTH_LONG).show();
        }
        else{
        Toast.makeText(getApplicationContext(), "Matched Password", Toast.LENGTH_LONG).show();
    }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        final Calendar cal = Calendar.getInstance();
        year_x=cal.get(Calendar.YEAR);
        month_x=cal.get(Calendar.MONTH);
        day_x=cal.get(Calendar.DAY_OF_MONTH);
        tvDate = (TextView) findViewById(R.id.tvDate);
        showDialogOnButtonClick();
        emailValidate = (EditText)findViewById(R.id.etMail);
        etPhone=(EditText)findViewById(R.id.etPhone);
        etPsw=(EditText)findViewById(R.id.etPsw);
        etRPsw=(EditText)findViewById(R.id.etRPsw);
        //textView = (TextView)findViewById(R.id.text);

    }
    public void showDialogOnButtonClick(){
        btn=(Button)findViewById(R.id.btnDate);
        btn.setOnClickListener (new View.OnClickListener(){
                                    @Override
                                    public void onClick(View v){
                                        showDialog(DIALOG_ID);
                                    }
                                }
        );
    }
    @Override
    protected Dialog onCreateDialog(int id){
        if (id==DIALOG_ID)
            return new DatePickerDialog(this,dpickerListner, year_x,month_x,day_x);
        return null;

    }

    private DatePickerDialog.OnDateSetListener dpickerListner=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view,int year,int monthofyear,int dayofmonth){
            year_x=year;
            month_x=monthofyear+1;
            day_x=dayofmonth;
            Toast.makeText(RegistrationActivity.this,year_x+"/"+month_x+"/"+day_x,Toast.LENGTH_SHORT).show();
            tvDate.setText(year_x+"/"+month_x+"/"+day_x);
        }
    };
}