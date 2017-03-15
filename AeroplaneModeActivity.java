package com.felight.myapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.felight.myapp2.utils.Util;

public class AeroplaneModeActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("AeroplaneModeActivity","Hiiiii");
        Util.toastIt(context,"Aeroplane mode active");

    }
}

