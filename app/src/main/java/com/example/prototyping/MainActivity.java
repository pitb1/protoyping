package com.example.prototyping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private ListView listView ;
AttendanceActivity.CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }
}
