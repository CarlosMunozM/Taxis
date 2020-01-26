package com.example.taxis.Modelo;

import java.util.Date;


public class TaxistaMOD {
    
    private int id_taxista;
    private String nombre, apellido, cedula, licencia, telefono, imagen, estado, correo, usuario, clave, recuperarclave, genero;
    Date fechaNacimiento;
    
    MenuMOD menuMOD = new MenuMOD();
    TipoUsuarioMOD tipoUsuario = new TipoUsuarioMOD();

    public int getId_taxista() {
        return id_taxista;
    }

    public void setId_taxista(int id_taxista) {
        this.id_taxista = id_taxista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getRecuperarclave() {
        return recuperarclave;
    }

    public void setRecuperarclave(String recuperarclave) {
        this.recuperarclave = recuperarclave;
    }

    public MenuMOD getMenuMOD() {
        return menuMOD;
    }

    public void setMenuMOD(MenuMOD menuMOD) {
        this.menuMOD = menuMOD;
    }

    public TipoUsuarioMOD getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioMOD tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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
