package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class ListviewActivity extends AppCompatActivity {
    ListView lvAmNhac;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        lvAmNhac=(ListView) findViewById(R.id.listviewAmNhac);
         arrayCourse= new ArrayList<>();
        arrayCourse.add("Khiêu Vũ");
        arrayCourse.add("Nhạc Kháng Chiến");
        arrayCourse.add("Nhạc Phim");
        arrayCourse.add("Nhạc Game");
        arrayCourse.add("Ngâm Thơ");
        arrayCourse.add("Bóng Rổ");
        arrayCourse.add("Chạy Bộ");
        arrayCourse.add("Đọc sách ");
        arrayCourse.add("Ngủ Nướng");
        ArrayAdapter adapter = new ArrayAdapter(ListviewActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        lvAmNhac.setAdapter(adapter);

        BottomNavigationView navigationView  = findViewById(R.id.bottom_menu);
        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        Intent intent = new Intent(ListviewActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.sothich:
                        break;
                }
            }
        });
    }

}
