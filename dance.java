package com.example.chinki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class dance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        Button goback = (Button) findViewById(R.id.back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        VideoView video = (VideoView) findViewById(R.id.videoView);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.doreamon);
        MediaController controller=new MediaController(this);
        video.setMediaController(controller);
        controller.setAnchorView(video);
        video.start();
    }
}