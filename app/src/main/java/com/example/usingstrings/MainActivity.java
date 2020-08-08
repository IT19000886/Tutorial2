package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i ( "Lifecycle",  "OnCreate() invoked" );

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);



    }
    protected void onStart()
    {
        super.onStart();
        Log.i ( "Lifecycle", "OnStart() invoked");

    }
    protected void onRestart()
    {
        super.onRestart();
        Log.i ( "Lifecycle", "OnRestart() invoked");

    }
    protected void onResume()
    {
        super.onResume();
        Log.i ( "Lifecycle", "OnResume() invoked");

    }
}