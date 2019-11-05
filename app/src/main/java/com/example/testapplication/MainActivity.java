package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.btnNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "NextClicked", Toast.LENGTH_SHORT).show();
                //checkBarcode("123");
                Intent audioPlayer = new Intent(MainActivity.this, AudioPlayFromUrl.class);
                startActivity(audioPlayer);

            }
        });
    }

    private void checkBarcode(final String barcode) {

        //Toast.makeText(MainActivity.this, "Method Call", Toast.LENGTH_SHORT).show();

    }
}
