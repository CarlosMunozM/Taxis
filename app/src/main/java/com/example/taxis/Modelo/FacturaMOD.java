
package com.example.taxis.Modelo;

public class FacturaMOD {
    
    private int id_factura;
    private Double valor;
    private String descripción, estado;
    
    CarreraMOD carreraMOD = new CarreraMOD();

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CarreraMOD getCarreraMOD() {
        return carreraMOD;
    }

    public void setCarreraMOD(CarreraMOD carreraMOD) {
        this.carreraMOD = carreraMOD;
    }
    
    
}
