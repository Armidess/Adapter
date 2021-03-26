package com.example.listviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ArmidesAdapter extends ArrayAdapter<String> {
    String[] arr;

    public ArmidesAdapter(@NonNull Context context, int resource, @NonNull String[] arr1) {
        super(context, resource, arr1);
        arr= arr1;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.armideslayout,parent,false);
        TextView t = convertView.findViewById(R.id.listView);
        t.setText(getItem(position));
        return convertView;

    }
}
