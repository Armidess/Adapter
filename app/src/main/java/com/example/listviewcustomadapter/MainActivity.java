package com.example.listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"1","1676","1867","1435","15676","1567","1657","165","9","16","17","6","5","5","4","3","2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArmidesAdapter as = new ArmidesAdapter(this,R.layout.armideslayout,arr);
        listView.setAdapter(as);
    }
}