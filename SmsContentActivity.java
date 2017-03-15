package com.felight.myapp2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class SmsContentActivity extends Activity {

    Button Send;
    EditText Phone, Msg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_content);

        Phone = (EditText) findViewById(R.id.editTextPhoneNo);
        Msg = (EditText) findViewById(R.id.editTextSMS);

        Send = (Button) findViewById(R.id.buttonSend);
        Send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    sendSMS(Phone.getText().toString(), Msg.getText().toString());
                    Toast.makeText(getBaseContext(), "Message Sent", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void sendSMS(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);

    }

    }



//EditText MobNumber;
//    TextView MessageText;
//    Button buttonSend;
//
//
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sms_content);
//        buttonSend = (Button) findViewById(R.id.buttonSend);
//        MobNumber = (EditText) findViewById(R.id.editTextPhoneNo);
//        MessageText = (EditText) findViewById(R.id.editTextSMS);
//        if (MobNumber != null) {
//
//            for (int i = 0; i < MobNumber.size(); i++) {
//                String message = MessageText.getText().toString();
//                String tempMobileNumber = MobNumber.get(i).toString();
//                sendSMS(tempMobileNumber, message);
//            }
//        }
//
//    private void sendSMS(String phoneNumber, String message) {
//        String SENT = "SMS_SENT";
//        String DELIVERED = "SMS_DELIVERED";
//
//        PendingIntent sentPI = PendingIntent.getBroadcast(this, 0, new Intent(
//                SENT), 0);
//
//        PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0,
//                new Intent(DELIVERED), 0);
//
//        // ---when the SMS has been sent---
//        registerReceiver(new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context arg0, Intent arg1) {
//                switch (getResultCode()) {
//                    case Activity.RESULT_OK:
//                        ContentValues values = new ContentValues();
//                        for (int i = 0; i < MobNumber.size()- 1; i++) {
//                            values.put("address", MobNumber.get(i).toString());// txtPhoneNo.getText().toString());
//                            values.put("body", MessageText.getText().toString());
//                        }
//                        getContentResolver().insert(
//                                Uri.parse("content://sms/sent"), values);
//                        Toast.makeText(getBaseContext(), "SMS sent",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
//                        Toast.makeText(getBaseContext(), "Generic failure",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_NO_SERVICE:
//                        Toast.makeText(getBaseContext(), "No service",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_NULL_PDU:
//                        Toast.makeText(getBaseContext(), "Null PDU",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_RADIO_OFF:
//                        Toast.makeText(getBaseContext(), "Radio off",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        }, new IntentFilter(SENT));
//
//        // ---when the SMS has been delivered---
//        registerReceiver(new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context arg0, Intent arg1) {
//                switch (getResultCode()) {
//                    case Activity.RESULT_OK:
//                        Toast.makeText(getBaseContext(), "SMS delivered",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                    case Activity.RESULT_CANCELED:
//                        Toast.makeText(getBaseContext(), "SMS not delivered",
//                                Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        }, new IntentFilter(DELIVERED));
//
//        SmsManager sms = SmsManager.getDefault();
//        sms.sendTextMessage(phoneNumber, null, message, sentPI, deliveredPI);
//    }
//}

//    Button buttonSend;
//    EditText textPhoneNo;
//    EditText textSMS;
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sms_content);
//        buttonSend = (Button) findViewById(R.id.buttonSend);
//        textPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
//        textSMS = (EditText) findViewById(R.id.editTextSMS);
//        buttonSend.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String phoneNo = textPhoneNo.getText().toString();
//                String sms = textSMS.getText().toString();
//                try {
//                    SmsManager smsManager = SmsManager.getDefault();
//                    smsManager.sendTextMessage(phoneNo, null, sms, null, null);
//                    Toast.makeText(getApplicationContext(), "SMS Sent!",
//                            Toast.LENGTH_LONG).show();
//                } catch (Exception e) {
//                    Toast.makeText(getApplicationContext(),
//                            "SMS faild, please try again later!",
//                            Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//}

//    EditText mobileno,message;
//    Button sendsms;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mobileno=(EditText)findViewById(R.id.etNumber);
//        message=(EditText)findViewById(R.id.etMessage);
//        sendsms=(Button)findViewById(R.id.btnSendSMS);
//
//        //Performing action on button click
//        sendsms.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                String no=mobileno.getText().toString();
//                String msg=message.getText().toString();
//
//                //Getting intent and PendingIntent instance
//                Intent intent=new Intent(getApplicationContext(),SmsContentActivity.class);
//                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);
//
//                //Get the SmsManager instance and call the sendTextMessage method to send message
//                SmsManager sms=SmsManager.getDefault();
//                sms.sendTextMessage(no, null, msg, pi,null);
//
//                Toast.makeText(getApplicationContext(), "Message Sent successfully!",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_sms, menu);
//        return true;
//    }

//
//    Button buttonSend;
//    EditText textPhoneNo;
//    EditText textSMS;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sms_content);
//
//        buttonSend = (Button) findViewById(R.id.btnSendSMS);
//        textPhoneNo = (EditText) findViewById(R.id.etNumber);
//        textSMS = (EditText) findViewById(R.id.etMessage);
//
//        buttonSend.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                String phoneNo = textPhoneNo.getText().toString();
//                String sms = textSMS.getText().toString();
//
//                try {
//                    SmsManager smsManager = SmsManager.getDefault();
//                    smsManager.sendTextMessage(phoneNo, null, sms, null, null);
//                    Toast.makeText(getApplicationContext(), "SMS Sent!",
//                            Toast.LENGTH_LONG).show();
//                } catch (Exception e) {
//                    Toast.makeText(getApplicationContext(),
//                            "SMS faild, please try again later!",
//                            Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//                }
//
//            }
//        });
//    }
