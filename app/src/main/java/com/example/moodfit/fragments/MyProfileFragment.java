package com.example.moodfit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.net.Uri;

import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;

import com.example.moodfit.EditProfileActivity;
import com.example.moodfit.R;
import com.example.moodfit.SettingActivity;

import de.hdodenhof.circleimageview.CircleImageView;



public class MyProfileFragment extends Fragment {

    private CircleImageView profileImage;
    private TextView username;
    private Button editProfileButton;
    private TextView yourResults;
    private ImageView image;

    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;
    private CardView cardView5;

    public MyProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_profile, container, false);
        CircleImageView profileImage = view.findViewById(R.id.profile_image);
        TextView username = view.findViewById(R.id.username);
        Button editProfileButton = view.findViewById(R.id.edit_profile_button);
        Button settingButton = view.findViewById(R.id.setting_button);
        TextView yourResults = view.findViewById(R.id.your_results);
        ImageView imageView = view.findViewById(R.id.result_image);
        CardView cardView1 = view.findViewById(R.id.card_view1);
        CardView cardView2 = view.findViewById(R.id.card_view2);
        CardView cardView3 = view.findViewById(R.id.card_view3);
        CardView cardView4 = view.findViewById(R.id.card_view4);
        CardView cardView5 = view.findViewById(R.id.card_view5);


        //set user's name and profile picture
        username.setText("John Doe");
        profileImage.setImageResource(R.drawable.person1);

        //set onClickListener for edit profile button
        editProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Open setting screen
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });

        //TODO: Add data to card views and graph
        return view;
    }

}
