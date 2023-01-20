package com.example.moodfit.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import de.hdodenhof.circleimageview.CircleImageView;

import com.example.moodfit.AiChat;
import com.example.moodfit.CommunityMessages;
import com.example.moodfit.ForgetPassword;
import com.example.moodfit.Message;
import com.example.moodfit.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CommunityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommunityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CommunityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CommunityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CommunityFragment newInstance(String param1, String param2) {
        CommunityFragment fragment = new CommunityFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_community, container, false);

        CardView cardView = rootView.findViewById(R.id.card_1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView2 = rootView.findViewById(R.id.card_2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView3 = rootView.findViewById(R.id.card_3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView4 = rootView.findViewById(R.id.card_4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView5 = rootView.findViewById(R.id.card_5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView6 = rootView.findViewById(R.id.card_6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView7 = rootView.findViewById(R.id.card_7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView8 = rootView.findViewById(R.id.card_8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView9 = rootView.findViewById(R.id.card_9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CardView cardView10 = rootView.findViewById(R.id.card_10);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CommunityMessages.class);
                startActivity(intent);
            }
        });
        CircleImageView aiChat = (CircleImageView) rootView.findViewById(R.id.ai_chat);
        aiChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AiChat.class);
                startActivity(intent);
            }
        });
        CircleImageView ProfessionalChat = (CircleImageView) rootView.findViewById(R.id.professional);
        ProfessionalChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AiChat.class);
                startActivity(intent);
            }
        });




        return rootView;


    }
}