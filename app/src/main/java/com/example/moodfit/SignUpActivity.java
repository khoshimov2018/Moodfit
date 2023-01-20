package com.example.moodfit;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import com.example.moodfit.fragments.HomeFragment;

public class SignUpActivity extends AppCompatActivity {

    private EditText mNameEditText;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Button mSignUpButton;
    private Button mSignInButton;
    private Button mLoginButton;
    private Button mFacebookButton;
    private Button mGoogleButton;
    private Button mAppleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mNameEditText = findViewById(R.id.name_form);
        mEmailEditText = findViewById(R.id.email_form);
        mPasswordEditText = findViewById(R.id.password_form);
        mSignInButton = findViewById(R.id.sign_in_button);
        mSignUpButton = findViewById(R.id.sign_up_button);
        mFacebookButton = findViewById(R.id.facebook_button);
        mGoogleButton = findViewById(R.id.google_button);
        mAppleButton = findViewById(R.id.apple_button);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameEditText.getText().toString();
                String email = mEmailEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {

                    Intent intent = new Intent(SignUpActivity.this, BottomNavigation.class);
                    intent.putExtra("FRAGMENT", "HOME");
                    startActivity(intent);
                    finish();
                }

            }
        });
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);

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



    }

    private void signUp() {
        // Get input from EditText
        String name = mNameEditText.getText().toString();
        String email = mEmailEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();

        // Validate input
        if (name.isEmpty()) {
            mNameEditText.setError("Name is required");
            return;
        }
        if (email.isEmpty()) {
            mEmailEditText.setError("Email is required");
            return;
        }
        if (password.isEmpty()) {
            mPasswordEditText.setError("Password is required");
            return;
        }
    }
}