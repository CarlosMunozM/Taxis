package com.example.taxis.Modelo;

public class TaxiMOD {
    private int id_taxi, anio;
    private String marca, placa, estado;
    TaxistaMOD taxistaMOD = new TaxistaMOD();

    public int getId_taxi() {
        return id_taxi;
    }

    public void setId_taxi(int id_taxi) {
        this.id_taxi = id_taxi;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TaxistaMOD getTaxistaMOD() {
        return taxistaMOD;
    }

    public void setTaxistaMOD(TaxistaMOD taxistaMOD) {
        this.taxistaMOD = taxistaMOD;
    }
}
