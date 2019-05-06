package com.example.avatar.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.avatar.R;

public class Images_Recycler_View_Adapter extends RecyclerView.Adapter<Images_Recycler_View_Adapter.MyViewHolder> {

    Context mContext;
    int[] mData;

    public Images_Recycler_View_Adapter(Context mContext, int[] mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        LayoutInflater myInflater = LayoutInflater.from(mContext);
        v = myInflater.inflate(R.layout.cardview_item, viewGroup, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.IV_Avatars_Image.setImageResource(mData[i]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView IV_Avatars_Image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            IV_Avatars_Image = (ImageView) itemView.findViewById(R.id.avatar_image);
        }
    }
}
