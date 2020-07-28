package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   startActivity(new Intent(MainActivity.this,MainSplash.class));
        try {
            sleep(11001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // close splash activity
        finish();*/

    }
}