package com.example.avatar;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.avatar.Adapters.Avatars_Recycler_View_Adapter;
import com.example.avatar.model.avatars;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    List<avatars> lstAvatars;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lstAvatars = new ArrayList<>();
        lstAvatars.add(new avatars(R.drawable.pikachu,"pika"));
        lstAvatars.add(new avatars(R.drawable.spider_man, "chelovek-pauk"));

        myrecyclerView = (RecyclerView) findViewById(R.id.recyclerview_id_avatars);
        Avatars_Recycler_View_Adapter recycler_view_adapter = new Avatars_Recycler_View_Adapter(this, lstAvatars);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myrecyclerView.setAdapter(recycler_view_adapter);

        final Intent intent = new Intent(this, Add_Avatar.class);
        Button b = (Button) findViewById(R.id.bu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
