package com.muhammadreza.kitalulustest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btUser, btDetail;
    public static TextView tvUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btUser = (Button) findViewById(R.id.btUsers);
        btDetail = (Button) findViewById(R.id.btDetail);
        tvUsers = (TextView) findViewById(R.id.tvUsers);

        btUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FetchData process = new FetchData();
                process.execute();

            }
        });
        btDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FetchDataDetail processDetail = new FetchDataDetail();
                processDetail.execute();

            }
        });
    }
}