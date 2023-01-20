package com.example.moodfit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class AiChatAdapter extends RecyclerView.Adapter<AiChatAdapter.ViewHolder> {

    private List<Message> messages;

    public AiChatAdapter(List<Message> messages) {
        this.messages = messages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Message message = messages.get(position);
        holder.bind(message);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView messageTextView;
        private ImageView messageStatusImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            messageTextView = itemView.findViewById(R.id.message_text);
            messageStatusImageView = itemView.findViewById(R.id.message_status);
        }

        public void bind(Message message) {
            messageTextView.setText(message.getText());
            if (message.isSent()) {
                messageStatusImageView.setImageResource(R.drawable.ai_chat);
            } else {
                messageStatusImageView.setImageResource(R.drawable.ai_chat);
            }
        }
    }
}
