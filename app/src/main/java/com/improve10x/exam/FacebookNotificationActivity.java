package com.improve10x.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FacebookNotificationActivity extends AppCompatActivity {
    FacebookNotificationItem[] facebookNotificationItem;
    RecyclerView notificationsRv;
    FacebookNotificationAdapter facebookNotificationAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_notification);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        notificationsRv = findViewById(R.id.notifications_rv);
    }

    public void createData(){
        facebookNotificationItem = new FacebookNotificationItem[7];

        facebookNotificationItem[0] = new FacebookNotificationItem();
        facebookNotificationItem[0].name = "Angela Jaemi Fvorito Huit reacted to your Story.";
        facebookNotificationItem[0].time = "1 hour ago";
        facebookNotificationItem[0].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[1] = new FacebookNotificationItem();
        facebookNotificationItem[1].name = "Kimwana Michael, Linh An and Channell Boxly asked to join I Love Stil Life painting!.";
        facebookNotificationItem[1].time = "1 hour ago";
        facebookNotificationItem[1].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[2] = new FacebookNotificationItem();
        facebookNotificationItem[2].name = "Lloyd Cafe Cadena is live now: LIPIT NA MAG END OF SEASON!!!.";
        facebookNotificationItem[2].time = "5 minutes ago";
        facebookNotificationItem[2].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[3] = new FacebookNotificationItem();
        facebookNotificationItem[3].name = "Sia Ellise Mejorada commented on a post in Hachi's Buy and Sell Group.";
        facebookNotificationItem[3].time = "1 hour ago";
        facebookNotificationItem[3].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[4] = new FacebookNotificationItem();
        facebookNotificationItem[4].name = "Mavreen Anne Romero and others  added  to their stories.";
        facebookNotificationItem[4].time = "2 hours ago";
        facebookNotificationItem[4].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[5] = new FacebookNotificationItem();
        facebookNotificationItem[5].name = "Sosy Sopie, Rampage TracelendTours and LetsircEcarg Nodner Nilillam listed in CAMSUR...";
        facebookNotificationItem[5].time = "2 hours ago";
        facebookNotificationItem[5].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItem[6] = new FacebookNotificationItem();
        facebookNotificationItem[6].name = "Bobby Alvarez and others added to their stories.";
        facebookNotificationItem[6].time = "2 hours ago";
        facebookNotificationItem[6].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
    }

    public void createAdapter(){
        facebookNotificationAdapter = new FacebookNotificationAdapter(facebookNotificationItem);
    }

    public void connectAdapter(){
        notificationsRv.setLayoutManager(new LinearLayoutManager(this));
        notificationsRv.setAdapter(facebookNotificationAdapter);
    }
}