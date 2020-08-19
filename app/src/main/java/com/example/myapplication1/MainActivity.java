package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button true_btn;
    private Button false_btn;
    private TextView questionView;
    private Question[] questions = new Question[]{
            new Question(R.string.question_text1, true),
            new Question(R.string.question_text2, false),
            new Question(R.string.question_text3, false),
            new Question(R.string.question_text4, true),
    };
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        true_btn = (Button) findViewById(R.id.true_btn);
        false_btn = (Button) findViewById(R.id.false_btn);
        questionView = (TextView) findViewById(R.id.question_view);

        true_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
                //Первый вариант избежать выхода за границы массива
//                currentIndex++;
//                if (currentIndex == questions.length) currentIndex = 0;

                //Второй вариант избежать выхода за границы массива
                currentIndex = (currentIndex + 1) % questions.length;
                updateQuestion();
            }
        });

        false_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
                //Первый вариант избежать выхода за границы массива
//                currentIndex++;
//                if (currentIndex == questions.length) currentIndex = 0;

                //Второй вариант избежать выхода за границы массива
                currentIndex = (currentIndex + 1) % questions.length;
                updateQuestion();
            }
        });

        updateQuestion();
    }

    public void updateQuestion() {
        int questionId = questions[currentIndex].getTextId();
        questionView.setText(questionId);
    }

    public void checkAnswer(boolean userAnswer) {
        boolean answer = questions[currentIndex].isAnswer();
        if (userAnswer == answer) {
            Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
        }
    }
}