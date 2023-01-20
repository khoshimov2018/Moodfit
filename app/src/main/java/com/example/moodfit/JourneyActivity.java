package com.example.moodfit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class JourneyActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 100;
    Button uploadButton;
    ImageView uploadedPicture;
    FrameLayout uploadedPictureFrame;
    TextView echoAIText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        uploadButton = findViewById(R.id.upload_button);
        uploadedPicture = findViewById(R.id.uploaded_picture);
        uploadedPictureFrame = findViewById(R.id.uploaded_picture_frame);
        echoAIText = findViewById(R.id.echo_ai_text);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
            }
        });
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                ImageView imageView = findViewById(R.id.uploaded_picture);
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(View.VISIBLE);

                TextView textView = findViewById(R.id.echo_ai_text);
                textView.setText("Echo AI thinks You Are Happy!!!");
                textView.setVisibility(View.VISIBLE);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
