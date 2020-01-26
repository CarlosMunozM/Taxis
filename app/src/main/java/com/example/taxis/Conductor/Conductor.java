package com.example.taxis.Conductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.taxis.R;

public class Conductor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conductor);

        SharedPreferences prefs = getSharedPreferences("datos_login",   Context.MODE_PRIVATE);
        String id = prefs.getString("id", "");
        String nombres = prefs.getString("nombres", "");
        String apellidos = prefs.getString("apellidos", "");
        String tipoUsuario = prefs.getString("tipoUsuario", "");

        getSupportActionBar().setTitle(id+" "+nombres+" "+apellidos+" "+tipoUsuario);
        //getSupportActionBar().setTitle("Menú del Conductor");
    }
}
