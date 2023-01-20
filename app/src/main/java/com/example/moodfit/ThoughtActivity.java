package com.example.moodfit;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import android.widget.TextView;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.Bundle;

public class ThoughtActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton addNoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought);



        addNoteButton = findViewById(R.id.button_add_note);



        // Set a click listener for the FloatingActionButton
        addNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the button click
            }
        });
    }
}
