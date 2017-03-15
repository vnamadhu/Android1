package com.felight.myapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.felight.myapp2.utils.Util;

public class BootCompleted extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("BootCompleted","Hiiiii");
        Util.toastIt(context,"Boot Completed");

    }
}
