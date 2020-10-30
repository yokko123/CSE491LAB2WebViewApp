package com.example.cse491lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        String text = intent.getStringExtra(activity2.EXTRA_TEXT);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.getSettings().getJavaScriptEnabled();
        myWebView.loadUrl(text);

    }
}