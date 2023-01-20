package com.example.moodfit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import de.hdodenhof.circleimageview.CircleImageView;
import com.example.moodfit.fragments.MyProfileFragment;

public class EditProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        AppCompatButton backButton = findViewById(R.id.submit_button);



        //set onClickListener for edit profile button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open edit profile screen
                Intent intent = new Intent(EditProfileActivity.this, MyProfileFragment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}