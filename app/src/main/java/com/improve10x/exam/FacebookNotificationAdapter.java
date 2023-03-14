package com.improve10x.exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FacebookNotificationAdapter extends RecyclerView.Adapter<FacebookNotificationViewHolder> {
    FacebookNotificationItem[] items;

    public FacebookNotificationAdapter(FacebookNotificationItem[] facebookNotificationItems){
        items = facebookNotificationItems;
    }

    @NonNull
    @Override
    public FacebookNotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_notification_item,parent,false);
        FacebookNotificationViewHolder viewHolder = new FacebookNotificationViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookNotificationViewHolder holder, int position) {
        FacebookNotificationItem item = items[position];
        holder.nameTxt.setText(item.name);
        holder.timeTxt.setText(item.time);
        Picasso.get().load(item.profileUrl).into(holder.fbProfileIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
