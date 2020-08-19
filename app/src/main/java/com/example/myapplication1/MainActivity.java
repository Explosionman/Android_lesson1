package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button VP_btn;
    private Button NaVi_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VP_btn = (Button) findViewById(R.id.VP_btn);
        NaVi_btn = (Button) findViewById(R.id.NaVi_btn);

        VP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.VP_toast, Toast.LENGTH_SHORT).show();
            }
        });

        NaVi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.NaVi_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}