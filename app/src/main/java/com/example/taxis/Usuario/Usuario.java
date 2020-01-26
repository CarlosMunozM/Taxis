package com.example.taxis.Usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.taxis.R;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario);

        SharedPreferences prefs = getSharedPreferences("datos_login",   Context.MODE_PRIVATE);
        String id = prefs.getString("id", "");
        String nombres = prefs.getString("nombres", "");
        String apellidos = prefs.getString("apellidos", "");
        String tipoUsuario = prefs.getString("tipoUsuario", "");

        getSupportActionBar().setTitle(id+" "+nombres+" "+apellidos+" "+tipoUsuario);
        //getSupportActionBar().setTitle("Menú del Usuario");
    }
}
