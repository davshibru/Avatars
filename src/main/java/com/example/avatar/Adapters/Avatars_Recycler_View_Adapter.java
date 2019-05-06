package com.example.avatar.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avatar.R;
import com.example.avatar.model.avatars;

import java.util.List;

public class Avatars_Recycler_View_Adapter extends RecyclerView.Adapter<Avatars_Recycler_View_Adapter.MyViewHolder> {

    Context mContext;
    List<avatars> mData;

    public Avatars_Recycler_View_Adapter(Context mContext, List<avatars> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_avatar,viewGroup,false);
        MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.TV_Name.setText(mData.get(i).getName());
        myViewHolder.IV_Image.setImageResource(mData.get(i).getImage());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView TV_Name;
        private ImageView IV_Image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            TV_Name = (TextView) itemView.findViewById(R.id.avatar_name);
            IV_Image = (ImageView) itemView.findViewById(R.id.avatars_image);
        }
    }
}
