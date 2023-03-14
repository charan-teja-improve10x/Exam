package com.improve10x.exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacebookNotificationAdapter extends RecyclerView.Adapter {
    FacebookNotificationItem[] items;

    public FacebookNotificationAdapter(FacebookNotificationItem[] facebookNotificationItems){
        items = facebookNotificationItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_notification_item,parent,false);
        FacebookNotificationViewHolder viewHolder = new FacebookNotificationViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
