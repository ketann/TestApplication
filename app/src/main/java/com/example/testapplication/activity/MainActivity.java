package com.example.testapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testapplication.R;
import com.example.testapplication.tabbar.activity.TabActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonNext, buttonTabActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.btnNext);
        buttonTabActivity = (Button) findViewById(R.id.btnTabActivity);

        buttonNext.setOnClickListener(this);
        buttonTabActivity.setOnClickListener(this);

    }

    private void checkBarcode(final String barcode) {

        //Toast.makeText(MainActivity.this, "Method Call", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                Intent audioPlayer = new Intent(MainActivity.this, AudioPlayFromUrl.class);
                startActivity(audioPlayer);
                break;

            case R.id.btnTabActivity:
                Intent tabActivity = new Intent(MainActivity.this, TabActivity.class);
                startActivity(tabActivity);
                break;

            default:
                break;

        }


    }
}
