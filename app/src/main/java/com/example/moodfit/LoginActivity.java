package com.example.moodfit;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class LoginActivity extends AppCompatActivity {

    private TextView mWelcomeText;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Button mForgot;
    private Button mLoginButton;
    private TextView mOrText;
    private Button mFacebookButton;
    private Button mGoogleButton;
    private Button mAppleButton;
    private Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mWelcomeText = findViewById(R.id.welcome_text);
        mEmailEditText = findViewById(R.id.email_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);
        mLoginButton = findViewById(R.id.login_button);
        mForgot = findViewById(R.id.forgot_password);
        mOrText = findViewById(R.id.or_text);
        mFacebookButton = findViewById(R.id.facebook_button);
        mGoogleButton = findViewById(R.id.google_button);
        mAppleButton = findViewById(R.id.apple_button);
        mSignUpButton = findViewById(R.id.sign_up_button);

        // Set onClickListeners for buttons
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform login action
            }
        });

        mFacebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(facebookIntent);
            }
        });


        mGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(googleIntent);
            }
        });

        mAppleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com"));
                startActivity(appleIntent);
            }
        });


        mAppleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform Apple login action
            }
        });

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpIntent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(signUpIntent);
            }
        });

        mForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent = new Intent(LoginActivity.this, ForgetPassword.class);
                startActivity(forgotIntent);
            }
        });
    }
}
