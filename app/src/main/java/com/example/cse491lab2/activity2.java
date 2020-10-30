package com.example.cse491lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.cse491lab2.EXTRA_STRING";
    String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        output = "https://google.com/search?q="+text;
        TextView textview = findViewById(R.id.textView);
        textview.setText(output);


        Button button = findViewById(R.id.search);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebView();
            }
        });


    }

    public void openWebView(){
        Intent intent = new Intent(this,Activity3.class);
        intent.putExtra(EXTRA_TEXT,output);
        startActivity(intent);

    }
}