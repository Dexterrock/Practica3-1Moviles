package com.example.practica3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Practica3_1I extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3_1_i);
    }
    public void PagWeb (View Pag){
        Toast.makeText(this, "CARGANDO PAG WEB...", Toast.LENGTH_LONG).show();
        Intent opcion1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://halo.fandom.com/es/wiki/Universo_de_Halo#Novelas"));
        startActivity(opcion1);
    }
    public void RetornaHome (View Retornar){
        Toast.makeText(this, "CARGANDO HOME...", Toast.LENGTH_LONG).show();
        Intent opcion2=new Intent(this, MainActivity.class);
        startActivity(opcion2);
    }
}