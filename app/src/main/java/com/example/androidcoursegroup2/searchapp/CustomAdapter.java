package com.example.androidcoursegroup2.searchapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.androidcoursegroup2.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{

    private Context c;
    private ArrayList<Data> data_item;
    private int resourse;

    public CustomAdapter(Context c, ArrayList<Data> data, int resourse) {
        this.c = c;
        this.data_item = data;
        this.resourse = resourse;
    }

    @Override
    public int getCount() {
        return data_item.size();
    }

    @Override
    public Data getItem(int i) {
        return data_item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

        if(v == null){
            v = LayoutInflater.from(c).inflate(resourse,null,false);
        }

        TextView address = v.findViewById(R.id.item_address);
        TextView price = v.findViewById(R.id.item_price);
        TextView bedrooms = v.findViewById(R.id.item_Bedrooms);
        TextView bathrooms = v.findViewById(R.id.item_Bathrooms);

        Data d = getItem(i);

        address.setText(d.getAddress());
        price.setText(d.getPrice());
        bedrooms.setText(d.getBedrooms()+ "");
        bathrooms.setText(d.getBathrooms()+"");

        return v;
    }
}
