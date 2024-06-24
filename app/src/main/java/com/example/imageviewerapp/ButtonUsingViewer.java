package com.example.imageviewerapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonUsingViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_button_using_viewer);

        Intent intent = getIntent();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    Integer ind = 1;

    @SuppressLint("SetTextI18n")
    public void setNextImage(View view){

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.b);

        switch (ind){
            case 0:
                imageView.setImageResource(R.drawable.a);
                break;
            case 1:
                imageView.setImageResource(R.drawable.b);
                break;
            case 2:
                imageView.setImageResource(R.drawable.c);
                break;
            case 3:
                imageView.setImageResource(R.drawable.d);
                break;
            case 4:
                imageView.setImageResource(R.drawable.e);
                break;
            case 5:
                imageView.setImageResource(R.drawable.f);
                break;
            case 6:
                imageView.setImageResource(R.drawable.g);
                break;
            case 7:
                imageView.setImageResource(R.drawable.h);
                break;
            case 8:
                imageView.setImageResource(R.drawable.i);
                break;
            case 9:
                imageView.setImageResource(R.drawable.z);
                break;
            case 10:
                imageView.setImageResource(R.drawable.k);
                break;
            case 11:
                imageView.setImageResource(R.drawable.l);
                break;
            case 12:
                imageView.setImageResource(R.drawable.m);
                break;
            case 13:
                imageView.setImageResource(R.drawable.n);
                break;
        }

        TextView textView = findViewById(R.id.textView);
        textView.setText("App by Shashi Singh.");

        if(ind<13){
            ind++;
        }else {
            ind = 0;
        }
    }
    @SuppressLint("SetTextI18n")
    public void setPreviousImage(View view){

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.b);

        switch (ind){
            case 0:
                imageView.setImageResource(R.drawable.m);
                ind = 12;
                break;
            case 1:
                imageView.setImageResource(R.drawable.n);
                ind = 13;
                break;
            case 2:
                imageView.setImageResource(R.drawable.a);
                ind = 1;
                break;
            case 3:
                imageView.setImageResource(R.drawable.b);
                ind = 2;
                break;
            case 4:
                imageView.setImageResource(R.drawable.c);
                ind = 3;
                break;
            case 5:
                imageView.setImageResource(R.drawable.d);
                ind = 4;
                break;
            case 6:
                imageView.setImageResource(R.drawable.e);
                ind = 5;
                break;
            case 7:
                imageView.setImageResource(R.drawable.f);
                ind = 6;
                break;
            case 8:
                imageView.setImageResource(R.drawable.g);
                ind = 7;
                break;
            case 9:
                imageView.setImageResource(R.drawable.h);
                ind = 8;
                break;
            case 10:
                imageView.setImageResource(R.drawable.i);
                ind = 9;
                break;
            case 11:
                imageView.setImageResource(R.drawable.z);
                ind = 10;
                break;
            case 12:
                imageView.setImageResource(R.drawable.k);
                ind = 11;
                break;
            case 13:
                imageView.setImageResource(R.drawable.l);
                ind = 12;
                break;
        }

        TextView textView = findViewById(R.id.textView);
        textView.setText("App by Shashi Singh.");

    }
}