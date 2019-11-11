package com.example.testapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testapplication.R;
import com.example.testapplication.fabButton.FloatingActionButton;
import com.example.testapplication.tabbar.activity.TabActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button buttonNext, buttonTabActivity, btnFabActivity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    buttonNext = (Button) findViewById(R.id.btnNext);
    buttonTabActivity = (Button) findViewById(R.id.btnTabActivity);
    btnFabActivity = (Button) findViewById(R.id.btnFabActivity);

    buttonNext.setOnClickListener(this);
    buttonTabActivity.setOnClickListener(this);
    btnFabActivity.setOnClickListener(this);

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

      case R.id.btnFabActivity:
        Intent fabActivity = new Intent(MainActivity.this, FloatingActionButton.class);
        startActivity(fabActivity);
        break;



      default:
        break;

    }


  }
}