package com.example.testapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testapplication.R;

import java.io.IOException;

public class AudioPlayFromUrl extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "AudioPlayFromUrl";
    String AudioURL = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3";
    //String AudioURL = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3";
    MediaPlayer mediaplayer;
    private Button btnAudioPlayFromUrl, btnAudioStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_play_from_url);

        btnAudioPlayFromUrl = (Button) findViewById(R.id.btnAudioPlayFromUrl);
        btnAudioStop = (Button) findViewById(R.id.btnAudioStop);

        btnAudioPlayFromUrl.setOnClickListener(this);
        btnAudioStop.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAudioPlayFromUrl:
                playAudioFromURL();
                break;

            case R.id.btnAudioStop:
                stopPlaying();
                break;

            default:
                break;

        }
    }

    private void playAudioFromURL() {
        try {

            mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

            mediaplayer.setDataSource(AudioURL);
            mediaplayer.prepare();

        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mediaplayer.start();
    }

    private void stopPlaying() {
        mediaplayer.stop();
    }
}
