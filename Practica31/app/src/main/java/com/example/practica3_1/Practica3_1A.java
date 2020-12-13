package com.example.practica3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Practica3_1A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3_1);
    }
    public void Falso1 (View False1){
        Toast.makeText(this, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show();
        Intent opcion1=new Intent(this, Practica3_1B.class);
        startActivity(opcion1);
    }
    public void Verdadero1 (View True1){
        Toast.makeText(this, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show();
        Intent opcion2=new Intent(this, Practica3_1B.class);
        startActivity(opcion2);
    }
}