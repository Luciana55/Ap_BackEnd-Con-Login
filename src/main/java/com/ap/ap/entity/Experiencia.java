package com.ap.ap.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Getter
@Setter
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String posicion;
    private String nombreEmpresa;
    private String fechaInicio;
    private String fechaFin;
    @Column (length = 500)
    private String descripcion;

    public Experiencia() {

    }

    public Experiencia(Long id, String posicion, String nombreEmpresa, String fechaInicio, String fechaFin, String descripcion) {
        this.id = id;
        this.posicion = posicion;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "Experiencia{" +
                "id=" + id +
                ", posicion=" + posicion + '\'' +
                ", nombre=" + nombreEmpresa + '\'' +
                ", fecha de inicio=" + fechaInicio +  '\'' +
                ", fecha de finalizacion=" + fechaFin +  '\'' +
                ", descripcion=" + descripcion +  '\'' +
                '}';

    }


}
