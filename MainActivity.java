package com.example.player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mysoundbeliever;
    MediaPlayer mysoundblinding;
    public void play(View view)
    {
        mysoundbeliever.start();
    }
    public void pause(View view){
        mysoundbeliever.pause();
    }
    public void nextsong(View view){
        mysoundbeliever.stop();
        mysoundblinding.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysoundbeliever = MediaPlayer.create(this,R.raw.believer);
        mysoundblinding = MediaPlayer.create(this,R.raw.blindinglights);
    }

}