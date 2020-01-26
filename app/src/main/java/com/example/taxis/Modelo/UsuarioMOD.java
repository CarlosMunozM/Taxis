package com.example.taxis.Modelo;

import java.util.Date;

public class UsuarioMOD {
    int idusuario;
    String nombre, apellido, cedula, correo, telefono, estado, recuperarClave, usuario, clave, genero;
    Date fechaNacimiento;
    TipoUsuarioMOD tipoUsuario = new TipoUsuarioMOD();
    MenuMOD menuMOD = new MenuMOD();

    public int  getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int  idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String combre) {
        this.nombre = combre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRecuperarClave() {
        return recuperarClave;
    }

    public void setRecuperarClave(String recuperarClave) {
        this.recuperarClave = recuperarClave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TipoUsuarioMOD getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioMOD tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public MenuMOD getMenuMOD() {
        return menuMOD;
    }

    public void setMenuMOD(MenuMOD menuMOD) {
        this.menuMOD = menuMOD;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
