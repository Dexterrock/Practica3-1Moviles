package com.example.practica3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Practica3_1F extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3_1_f);
    }
    public void PreguntaFal6 (View False6){
        Toast.makeText(this, "RESPUESTA INCORRECTA", Toast.LENGTH_LONG).show();
        Intent opcion1=new Intent(this, Practica3_1G.class);
        startActivity(opcion1);
    }
    public void PreguntaCor6 (View True6){
        Toast.makeText(this, "RESPUESTA CORRECTA", Toast.LENGTH_LONG).show();
        Intent opcion2=new Intent(this, Practica3_1G.class);
        startActivity(opcion2);
    }
}