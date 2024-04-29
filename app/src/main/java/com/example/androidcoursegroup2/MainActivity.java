package com.example.androidcoursegroup2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText password;

    private Button goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        UserName = findViewById(R.id.userEdt);
        password = findViewById(R.id.passwordEdt);
        goBtn = findViewById(R.id.Login);

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity2.class);

                intent.putExtra("username",UserName.getText().toString().trim());
                intent.putExtra("password",password.getText().toString());

                startActivity(intent);
                finish();
            }
        });



    }
}