package com.minhnpa.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mp;
    Button btnPlay, btnStop, btnPause, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnPlay:
                mp.start();
                break;
            case R.id.btnStop:
                if (mp != null && mp.isPlaying()) {
                    mp.stop();
                }
                break;
            case R.id.btnPause:
                mp.pause();
                break;
            case R.id.btnExit:
                mp.stop();
                finish();
                break;
        }
    }
}
