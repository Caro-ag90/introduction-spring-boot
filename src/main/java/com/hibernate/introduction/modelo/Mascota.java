package com.hibernate.introduction.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascotas")
public class Mascota {
    @Id
    private int id;
    private String nombre;
    private String apellido;
    private String raza;
    private String foto;
    private String observacion;

    public Mascota(String nombre, String apellido, String raza, String foto, String observacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.raza = raza;
        this.foto = foto;
        this.observacion = observacion;
    }

    public Mascota(){

    }

    public int getId() {
        return id;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        String info ="----\n";
        info += "Mascota [apellido=" + apellido + ", foto=" + foto + ", id=" + id + ", nombre=" + nombre
                + ", observacion=" + observacion + ", raza=" + raza + "]";
        return info;
    }
    
    
    
    
}
