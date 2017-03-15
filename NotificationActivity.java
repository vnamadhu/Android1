package com.felight.myapp2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.felight.myapp2.NewsActivity;

public class NotificationActivity extends AppCompatActivity {
    MediaPlayer mp1;
    Vibrator v;
    NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        mp1=MediaPlayer.create(this,R.raw.beep);
        v = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);

    }
    @RequiresApi(api= Build.VERSION_CODES.JELLY_BEAN)
    public void createNotification(View view) {
        Intent intent = new Intent(this, NewsActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification noti = new Notification.Builder(this)
                .setSmallIcon(R.drawable.settings)
                .setContentTitle("Notification")
                .setContentText("This is Test Notification").setContentIntent(pIntent).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // hide the notification after its selected
        noti.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0, noti);

    }

    public void  vibrateapply(View view){
        v.vibrate(5000);
    }

    public void music(View view) {
        try {
            mp1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void doAll(View view){
        v.vibrate(5000);
        try {
            mp1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        createNotification(view);

    }
}



