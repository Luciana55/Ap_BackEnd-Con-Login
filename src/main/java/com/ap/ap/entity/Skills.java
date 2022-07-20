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
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String skill;
    private String porcentaje;
    private String url;

    public Skills() {
    }

    public Skills(Long id, String skill, String porcentaje, String url) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Habilidad{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", porcentaje='" + porcentaje + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

