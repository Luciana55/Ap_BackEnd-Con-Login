package com.ap.ap.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Column;

@Getter
@Setter
@Entity
public class Proyectos implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (nullable = false, updatable = false)
    private Long id;
    private String nombreProyecto;
    private String fecha;
    private String descripcion;
    private String urlImagen;
    private String urlSitio;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombreProyecto, String fecha, String descripcion, String urlImagen, String urlSitio) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlSitio = urlSitio;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                ", urlSitio='" + urlSitio + '\'' +
                '}';
    }
}
