package com.improve10x.exam;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacebookNotificationViewHolder extends RecyclerView.ViewHolder {
    TextView nameTxt;
    TextView timeTxt;
    ImageView fbProfileIv;
    public FacebookNotificationViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        fbProfileIv = itemView.findViewById(R.id.profile_iv);
    }
}
