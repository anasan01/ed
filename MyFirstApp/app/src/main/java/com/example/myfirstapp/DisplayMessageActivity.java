package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by anasan01 on 9/02/18.
 */

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        String value = getIntent().getStringExtra(MainActivity.TEXT_MESSAGE_KEY);

        TextView textView =(TextView) findViewById(R.id.textView);
        textView.setText(value);
    }
}
