package com.floydd.gitandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Tag","First commit changes ");
        Log.i("Tag","second commiting");
        Log.i("Tag","Third commit");
        Log.i("Tag","fourth commit");


    }

}