package com.example.practica3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton b1;
    private TextView pregunta, instruccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pregunta=(TextView)findViewById(R.id.tv_pregunta);

    }
    public void Comenzar (View INICIO){ //INICIO - PANEL PRINCIPAL
        Intent comenzar=new Intent(this, Practica3_1A.class);
        startActivity(comenzar);
    }
}