package com.example.androidcoursegroup2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView userText;
    private TextView passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        userText = findViewById(R.id.userTxt);
        passwordText = findViewById(R.id.passwordTxt);

        userText.setText(getIntent().getStringExtra("username"));
        passwordText.setText(getIntent().getStringExtra("password"));

    }
}