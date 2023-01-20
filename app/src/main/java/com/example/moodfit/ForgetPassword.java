package com.example.moodfit;
import androidx.appcompat.widget.AppCompatButton;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.Toast;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        AppCompatButton receiveMailBtn = findViewById(R.id.ReceiveMailBtn);
        receiveMailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgetPassword.this, "Check your email", Toast.LENGTH_SHORT).show();
            }
        });
    }
}