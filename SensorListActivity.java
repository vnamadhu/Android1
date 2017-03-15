package com.felight.myapp2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class SensorListActivity extends AppCompatActivity {

//    SensorManager smm;
//    List<Sensor> sensor;
//    ListView lv;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sensor_list);
//        smm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//        lv = (ListView) findViewById (R.id.listView1);
//        sensor = smm.getSensorList(Sensor.TYPE_ALL);
//        lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,  sensor));
//    }



    private TextView tvSensors;
    private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_list);
        tvSensors = (TextView) findViewById(R.id.tvSensors);
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }
    @Override
    protected void onStart() {
        super.onStart();
        List<Sensor> sensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder sensorInfo = new StringBuilder();
        for(Sensor sensor : sensors)
            sensorInfo.append("\n\n"+ sensor.getName() + " " + sensor.getType() + " " + sensor.getVendor());
        tvSensors.setText(sensorInfo.toString());

    }
}
