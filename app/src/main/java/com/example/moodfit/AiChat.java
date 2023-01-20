package com.example.moodfit;

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

public class AiChat extends AppCompatActivity {

    private RecyclerView messageList;
    private EditText messageInput;
    private Button sendButton;
    private AiChatAdapter messageAdapter;
    private List<Message> messages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_chat);


        messageList = findViewById(R.id.message_list);
        messageInput = findViewById(R.id.message_input);
        sendButton = findViewById(R.id.send_button);

        messages = new ArrayList<>();
        messageAdapter = new AiChatAdapter(messages);
        messageList.setAdapter(messageAdapter);
        messageList.setLayoutManager(new LinearLayoutManager(this));

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageText = messageInput.getText().toString();
                if (!TextUtils.isEmpty(messageText)) {
                    Message message = new Message(messageText, true);
                    messages.add(message);
                    messageAdapter.notifyDataSetChanged();
                    messageInput.setText("");
                }
            }
        });
    }
}