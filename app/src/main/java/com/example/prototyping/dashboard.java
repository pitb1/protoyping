package com.example.prototyping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void AttendanceActivity(View view)
    {
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }
}
