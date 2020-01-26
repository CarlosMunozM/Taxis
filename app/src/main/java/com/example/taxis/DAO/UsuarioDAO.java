package com.example.taxis.DAO;

import com.example.taxis.Modelo.UsuarioMOD;

import org.json.JSONException;
import org.json.JSONObject;

public class UsuarioDAO {

    public UsuarioMOD parsearWSlogin(String json) throws JSONException {

        UsuarioMOD usuario = new UsuarioMOD();
        JSONObject jsonObject = new JSONObject(json);

        String id, nombres, apellidos;

        id = jsonObject.getString("idusuario");
        nombres = jsonObject.getString("nombre");
        apellidos = jsonObject.getString("apellido");

        usuario.setIdusuario(Integer.parseInt(id));
        usuario.setNombre(nombres);
        usuario.setApellido(apellidos);

        JSONObject opciones = (JSONObject) jsonObject.get("tipoUsuario");
        usuario.getTipoUsuario().setId_tipo(Integer.parseInt(opciones.getString("id_tipo")));

        return usuario;
    }
}
