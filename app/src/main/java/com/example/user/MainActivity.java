package com.example.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener;

public class MainActivity extends AppCompatActivity {
    private Button btnsothich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsothich = (Button) findViewById(R.id.btnsothich);
        btnsothich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListviewActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView navigationView  = findViewById(R.id.bottom_menu);
        navigationView.setOnNavigationItemReselectedListener(new OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        break;
                    case R.id.sothich:
                        Intent intent = new Intent(MainActivity.this, ListviewActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}