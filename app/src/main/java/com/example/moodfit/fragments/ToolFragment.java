package com.example.moodfit.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;

import com.example.moodfit.CommunityMessages;
import com.example.moodfit.GoalActivity;
import com.example.moodfit.HealthActivity;
import com.example.moodfit.HopeActivity;
import com.example.moodfit.JourneyActivity;
import com.example.moodfit.MeditationActivity;
import com.example.moodfit.R;
import com.example.moodfit.ThoughtActivity;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ToolFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ToolFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ToolFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ToolFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ToolFragment newInstance(String param1, String param2) {
        ToolFragment fragment = new ToolFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tool, container, false);

        CardView card1 = view.findViewById(R.id.card_1);
        ImageView cardIcon1 = view.findViewById(R.id.card_icon_1);
        TextView cardTitle1 = view.findViewById(R.id.card_title_1);
        AppCompatButton cardButton1 = view.findViewById(R.id.cad_button_1);

        cardIcon1.setImageResource(R.drawable.position48);
        cardTitle1.setText("Meditation");
        cardButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MeditationActivity.class);
                startActivity(intent);
                // navigate to next screen
            }
        });

        CardView card2 = view.findViewById(R.id.card_2);
        ImageView cardIcon2 = view.findViewById(R.id.card_icon_2);
        TextView cardTitle2 = view.findViewById(R.id.card_title_2);
        AppCompatButton cardButton2 = view.findViewById(R.id.cad_button_2);

        cardIcon2.setImageResource(R.drawable.journey48);
        cardTitle2.setText("Emotion Tracker");
        cardButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JourneyActivity.class);
                startActivity(intent);
            }
        });

        CardView card3 = view.findViewById(R.id.card_3);
        ImageView cardIcon3 = view.findViewById(R.id.card_icon_3);
        TextView cardTitle3 = view.findViewById(R.id.card_title_3);
        AppCompatButton cardButton3 = view.findViewById(R.id.cad_button_3);

        cardIcon3.setImageResource(R.drawable.idea);
        cardTitle3.setText("Thoughts");
        cardButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThoughtActivity.class);
                startActivity(intent);
            }
        });

        CardView card4 = view.findViewById(R.id.card_4);
        ImageView cardIcon4 = view.findViewById(R.id.card_icon_4);
        TextView cardTitle4 = view.findViewById(R.id.card_title_4);
        AppCompatButton cardButton4 = view.findViewById(R.id.cad_button_4);
        cardIcon4.setImageResource(R.drawable.sun48);
        cardTitle4.setText("Hope");
        cardButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HopeActivity.class);
                startActivity(intent);
            }
        });

        CardView card5 = view.findViewById(R.id.card_5);
        ImageView cardIcon5 = view.findViewById(R.id.card_icon_5);
        TextView cardTitle5 = view.findViewById(R.id.card_title_5);
        AppCompatButton cardButton5 = view.findViewById(R.id.cad_button_5);

        cardIcon5.setImageResource(R.drawable.heal48);
        cardTitle5.setText("Health");
        cardButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HealthActivity.class);
                startActivity(intent);
            }
        });
        CardView card6 = view.findViewById(R.id.card_6);
        ImageView cardIcon6 = view.findViewById(R.id.card_icon_6);
        TextView cardTitle6 = view.findViewById(R.id.card_title_6);
        AppCompatButton cardButton6 = view.findViewById(R.id.cad_button_6);

        cardIcon6.setImageResource(R.drawable.goals48);
        cardTitle6.setText("Goals");
        cardButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GoalActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}