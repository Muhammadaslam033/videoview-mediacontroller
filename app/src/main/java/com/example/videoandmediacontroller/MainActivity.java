package com.example.videoandmediacontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button button;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.play);
        videoView=findViewById(R.id.videoView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.quran);
                MediaController mediaController=new MediaController(getApplicationContext());
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.start();

            }
        });
    }
}