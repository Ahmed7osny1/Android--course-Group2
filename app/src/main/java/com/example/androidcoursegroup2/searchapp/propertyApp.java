package com.example.androidcoursegroup2.searchapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcoursegroup2.R;

import java.util.ArrayList;

public class propertyApp extends AppCompatActivity {

    private ListView lv;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_property_app);

        lv = findViewById(R.id.list_item);

        ArrayList<Data> data = new ArrayList<>();

        data.add(new Data(
               "12 Street",
                "$309.00",
                1,
                1
        ));

        data.add(new Data(
                "13 Street",
                "$389.00",
                2,
                2
        ));

        data.add(new Data(
                "18 Street",
                "$400.40",
                3,
                2
        ));

        data.add(new Data(
                "16 Street",
                "$409.80",
                4,
                2
        ));

        adapter = new CustomAdapter(this,data,R.layout.list_item);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(
                        propertyApp.this,
                        adapter.getItem(i).getBedrooms()+"",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

    }
}