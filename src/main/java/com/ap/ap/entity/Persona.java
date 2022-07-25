package com.ap.ap.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String telefono;
    private String email;
    private String ubicacion;
    @Column(length = 500)
    private String sobremi;
    private String url_img;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String telefono, String email, String ubicacion, String sobremi, String url_img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.email = email;
        this.ubicacion = ubicacion;
        this.sobremi = sobremi;
        this.url_img = url_img;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido=" + apellido + '\'' +
                ", ocupación=" + ocupacion + '\'' +
                ", telefono=" + telefono + '\'' +
                ", email=" + email + '\'' +
                ", sobremi=" + sobremi + '\'' +
                ", urlImagen=" + url_img + '\'' +
                '}';
    }
}
