package com.example.prototyping;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class AttendanceActivity extends AppCompatActivity {
    String [] ZONES = {"Shalamar Town Zone", "Ravi Town Zone", "Aziz Bhatti Town Zone", "Samnabad Toqn Zone", "Shalamar Town Zone"};
    int [] Present = {20,15,20,12,20};
    int [] Absent = {05,10,5,13,05};
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        List<String> list = null;

         ListView listView = (ListView) findViewById(R.id.listview);
         CustomAdapter customAdapter = new CustomAdapter();
         listView.setAdapter(customAdapter);
       /*  list.add("arslan");
         list.add("tariq");
         list.add("fast");
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_spinner, list);*/

    }

    public void ZoneInfo(View view)
    {
        Intent intent = new Intent(this,ZoneInfo.class);
        startActivity(intent);
    }

    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return  ZONES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.listview_items, null);

            TextView textzone =  (TextView) findViewById(R.id.txt_xoneName);
            TextView text_totalnmbr = (TextView) findViewById(R.id.txt_totalnmbr);
            TextView text_total = (TextView) findViewById(R.id.txt_total);

            TextView text_presentnmbr = (TextView) findViewById(R.id.txt_present_number);
            TextView text_present = (TextView) findViewById(R.id.txt_present);

            TextView text_absentnmbr = (TextView) findViewById(R.id.txt_absent_number);
            TextView text_absent = (TextView) findViewById(R.id.txt_absent);


            /*textzone.setText("Arslan");
            text_presentnmbr.setText("Tariq");
            text_absentnmbr.setText("abcd");*/

            return view;
        }
    }

}