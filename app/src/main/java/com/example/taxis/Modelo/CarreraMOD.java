
package com.example.taxis.Modelo;

import java.util.Date;

public class CarreraMOD {
    private int id_carrera;
    private String destinoLat, destinoLong, origenLat, origenLong, lugarOrigen, lugarDestino, hora;
    private Double valor;
    private Date fecha;
    
    TaxiMOD taxi = new TaxiMOD();
    UsuarioMOD usuario = new UsuarioMOD();

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getDestinoLat() {
        return destinoLat;
    }

    public void setDestinoLat(String destinoLat) {
        this.destinoLat = destinoLat;
    }

    public String getDestinoLong() {
        return destinoLong;
    }

    public void setDestinoLong(String destinoLong) {
        this.destinoLong = destinoLong;
    }

    public String getOrigenLat() {
        return origenLat;
    }

    public void setOrigenLat(String origenLat) {
        this.origenLat = origenLat;
    }

    public String getOrigenLong() {
        return origenLong;
    }

    public void setOrigenLong(String origenLong) {
        this.origenLong = origenLong;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TaxiMOD getTaxi() {
        return taxi;
    }

    public void setTaxi(TaxiMOD taxi) {
        this.taxi = taxi;
    }

    public UsuarioMOD getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioMOD usuario) {
        this.usuario = usuario;
    }
    
    
    
}
