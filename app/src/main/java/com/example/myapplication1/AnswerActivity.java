package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        TextView answerTextView = (TextView) findViewById(R.id.answerTextView);
        Intent intent = getIntent();
        boolean answer = intent.getBooleanExtra("answer", true);
        if (answer == true) {
            answerTextView.setText(R.string.correct);
        } else {
            answerTextView.setText(R.string.incorrect);
        }
    }
}