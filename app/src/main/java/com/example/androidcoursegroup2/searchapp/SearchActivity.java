package com.example.androidcoursegroup2.searchapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcoursegroup2.R;

public class SearchActivity extends AppCompatActivity {

    private Spinner propertyType;
    private Button searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);

        propertyType = findViewById(R.id.propertyType);
        searchBtn = findViewById(R.id.btnSearch);

        ArrayAdapter<CharSequence> propertyTypeAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.property_type,
                android.R.layout.simple_spinner_dropdown_item
        );

        propertyType.setAdapter(propertyTypeAdapter);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(
//                        SearchActivity.this,
//                        "search btn",
//                        Toast.LENGTH_LONG
//                ).show();

                Intent intent = new Intent(
                        SearchActivity.this,
                        propertyApp.class);

                startActivity(intent);

            }
        });


    }
}