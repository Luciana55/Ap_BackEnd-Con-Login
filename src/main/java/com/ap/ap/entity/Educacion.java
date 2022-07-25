package com.ap.ap.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Getter
@Setter
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombreInstituto;
    private String titulo;
    private String fechaInicio;
    private String fechaFin;
    private String url_foto;

    public Educacion() {
    }

    public Educacion(Long id, String nombreInstituto, String titulo, String fechaInicio, String fechaFin, String url_foto) {
        this.id = id;
        this.nombreInstituto = nombreInstituto;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.url_foto = url_foto;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", nombreInstituto='" + nombreInstituto + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", url_foto='" + url_foto + '\'' +
                '}';

    }
}
