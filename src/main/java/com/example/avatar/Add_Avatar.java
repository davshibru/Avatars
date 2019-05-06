package com.example.avatar;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.example.avatar.Adapters.Images_Recycler_View_Adapter;

public class Add_Avatar extends AppCompatActivity {

    int[] lstImg;
    ImageView SelectImage;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__avatar);

        lstImg = new int[20];

        lstImg[0] = R.drawable.pikachu;
        lstImg[1] = R.drawable.spider_man;
        lstImg[2] = R.drawable.pikachu;
        lstImg[4] = R.drawable.spider_man;
        lstImg[5] = R.drawable.pikachu;
        lstImg[6] = R.drawable.spider_man;
        lstImg[7] = R.drawable.pikachu;
        lstImg[8] = R.drawable.spider_man;
        lstImg[9] = R.drawable.pikachu;
        lstImg[10] = R.drawable.spider_man;
        lstImg[11] = R.drawable.pikachu;
        lstImg[12] = R.drawable.spider_man;
        lstImg[13] = R.drawable.pikachu;
        lstImg[14] = R.drawable.spider_man;
        lstImg[15] = R.drawable.pikachu;
        lstImg[16] = R.drawable.spider_man;
        lstImg[17] = R.drawable.pikachu;
        lstImg[18] = R.drawable.spider_man;
        lstImg[19] = R.drawable.pikachu;

        myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.avatars_images);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.getWindow().setGravity(Gravity.BOTTOM);

        SelectImage = (ImageView) findViewById(R.id.selecter);

        SelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RecyclerView rv = (RecyclerView) myDialog.findViewById(R.id.recyclerview_images);
                Images_Recycler_View_Adapter rvAdapter = new Images_Recycler_View_Adapter(Add_Avatar.this, lstImg);
                rv.setLayoutManager(new GridLayoutManager(Add_Avatar.this,3));
                rv.setAdapter(rvAdapter);
                myDialog.show();
            }
        });
    }
}
