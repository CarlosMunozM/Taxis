package com.example.taxis.Administracion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taxis.Clases.ConexionPostgresql;
import com.example.taxis.Conductor.Conductor;
import com.example.taxis.DAO.UsuarioDAO;
import com.example.taxis.Modelo.UsuarioMOD;
import com.example.taxis.R;
import com.example.taxis.Usuario.Usuario;
import com.example.taxis.WebServices.Asynchtask;
import com.example.taxis.WebServices.WebService;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity implements Asynchtask {


    EditText txtUsuario, txtClave;
    TextInputLayout txtly_clave;
    String respuesta;
    ProgressDialog dialogo;
    UsuarioMOD usuarioMOD;
    UsuarioDAO usuarioDAO;
    ConexionPostgresql conexionPostgresql;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getSupportActionBar().setTitle("Fast Taxi");

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);
        txtly_clave = (TextInputLayout) findViewById(R.id.txtloginly_clave);
    }

    public void iniciarSesion(View view)
    {

        if(!txtUsuario.getText().toString().equals("") && !txtClave.getText().toString().equals("")) {

            txtUsuario.setError(null);
            txtUsuario.setCompoundDrawables(null, null, null, null);
            txtClave.setError(null);
            txtClave.setCompoundDrawables(null, null, null, null);
            txtly_clave.setPasswordVisibilityToggleEnabled(true);


            mostrarDialogo("Iniciando Sesión");

            Map<String, String> datos = new HashMap<String, String>();
            datos.put("accion", "login");
            datos.put("usr", txtUsuario.getText().toString());
            datos.put("clave", txtClave.getText().toString());
            WebService ws = new WebService("http://"+ conexionPostgresql.getServidor() +":8080/WsFastTaxi/wsLogin",
                    datos, this, this);
            ws.execute("");

        }
        else
        {
            Toast.makeText(this, "Llene todos los campos", Toast.LENGTH_SHORT).show();
            if(txtUsuario.getText().toString().equals("")) {
                txtUsuario.setError("Llene este campo");
            }
            if(txtClave.getText().toString().equals("")) {
                txtClave.setError("Llene este campo");
                txtly_clave.setPasswordVisibilityToggleEnabled(false);
            }
        }

    }

    public void registrarUsuario(View view) {
        startActivity(new Intent(getApplicationContext(), RegistrarUsuario.class));
    }

    @Override
    public void processFinish(String result) throws JSONException {

        if(!result.equals("error")) {
            usuarioMOD = new UsuarioMOD();
            usuarioDAO = new UsuarioDAO();

            usuarioMOD = usuarioDAO.parsearWSlogin(result);
            //Toast.makeText(getApplicationContext(),usuario.getIdusuario() + " "+ usuario.getNombre() + " "+ usuario.getApellido() + " "+ usuario.getTipoUsuario().getId_tipo(), Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Hola, " + usuarioMOD.getNombre(), Toast.LENGTH_SHORT).show();



            SharedPreferences prefs = getSharedPreferences("datos_login",   Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("id", String.valueOf(usuarioMOD.getIdusuario()));
            editor.putString("nombres", usuarioMOD.getNombre());
            editor.putString("apellidos", usuarioMOD.getApellido());
            editor.putString("tipoUsuario", String.valueOf(usuarioMOD.getTipoUsuario().getId_tipo()));
            editor.commit();

            if(usuarioMOD.getTipoUsuario().getId_tipo() == 1)
            {
                Intent intent = new Intent(this, Administrador.class);
                //intent.putExtra("idUsuario", usuario.getTipoUsuario().getId_tipo());
                startActivity(intent);
            }
            else if(usuarioMOD.getTipoUsuario().getId_tipo() == 2)
            {
                startActivity(new Intent(getApplicationContext(), Conductor.class));
            }
            else if(usuarioMOD.getTipoUsuario().getId_tipo() == 3)
            {
                startActivity(new Intent(getApplicationContext(), Usuario.class));
            }
            cerrarDialogo();

        }
        else
        {
            cerrarDialogo();
            Toast.makeText(this, "Error al iniciar Sesión", Toast.LENGTH_SHORT).show();
        }

    }

    public void mostrarDialogo(String texto)
    {
        dialogo = new ProgressDialog(this);
        dialogo.setMessage(texto);
        dialogo.setIndeterminate(false);
        dialogo.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        //dialogo.setCancelable(true);
        dialogo.show();
    }

    public void cerrarDialogo()
    {
        dialogo.dismiss();
    }
}
