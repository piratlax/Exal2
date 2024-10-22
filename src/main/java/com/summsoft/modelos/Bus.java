package com.summsoft.modelos;

import java.time.LocalDate;

public class Bus {

private int id;
private int modelo;
private String marca;
private String circulacion;
private String tipo;
private String placa;
private String estado;
private String numero;
private String activo;
private LocalDate vigencia_circulacion;
private String serie;
private String agente;
private String poliza;
private String telefono;
private LocalDate vigencia_seguro;
private LocalDate mantenimiento;
private String serie_motor;
private int kilometraje;
private LocalDate vigencia_contaminante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCirculacion() {
        return circulacion;
    }

    public void setCirculacion(String circulacion) {
        this.circulacion = circulacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public LocalDate getVigencia_circulacion() {
        return vigencia_circulacion;
    }

    public void setVigencia_circulacion(LocalDate vigencia_circulacion) {
        this.vigencia_circulacion = vigencia_circulacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getVigencia_seguro() {
        return vigencia_seguro;
    }

    public void setVigencia_seguro(LocalDate vigencia_seguro) {
        this.vigencia_seguro = vigencia_seguro;
    }

    public LocalDate getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(LocalDate mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getSerie_motor() {
        return serie_motor;
    }

    public void setSerie_motor(String serie_motor) {
        this.serie_motor = serie_motor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public LocalDate getVigencia_contaminante() {
        return vigencia_contaminante;
    }

    public void setVigencia_contaminante(LocalDate vigencia_contaminante) {
        this.vigencia_contaminante = vigencia_contaminante;
    }
    
}
