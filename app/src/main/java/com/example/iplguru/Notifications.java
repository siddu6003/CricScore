package com.example.iplguru;

import android.app.Notification;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class Notifications extends FirebaseMessagingService {

    public void onMessageReceived(RemoteMessage remoteMessage) {

      super.onMessageReceived(remoteMessage);
      getFirebaseMessage(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
        }


public void getFirebaseMessage(String title,String msg){
    NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"myFireBaseChannel")
            .setSmallIcon(R.drawable.ic_baseline_notifications_24)
            .setContentTitle(title)
            .setAutoCancel(true)
            .setContentText(msg);

    NotificationManagerCompat managerCompat=NotificationManagerCompat.from(this);
    managerCompat.notify(101,builder.build());
}
}
