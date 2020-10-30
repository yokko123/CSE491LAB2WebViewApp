package com.example.cse491lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.cse491lab2.EXTRA_TEXT";

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        editText = findViewById(R.id.input1);
        String text = editText.getText().toString();

        Intent intent = new Intent(this, activity2.class);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}