package com.summsoft.modelos;

import java.time.LocalDate;

public class Conductor {

    private int id;
    private String nombre;
    private String celular;
    private String contacto;
    private String activo;
    private String licencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public LocalDate getVigencia() {
        return vigencia;
    }

    public void setVigencia(LocalDate vigencia) {
        this.vigencia = vigencia;
    }

    public LocalDate getPsicofisico() {
        return psicofisico;
    }

    public void setPsicofisico(LocalDate psicofisico) {
        this.psicofisico = psicofisico;
    }
    private LocalDate vigencia;
    private LocalDate psicofisico;
    
}
