package com.example.ParcialFinalWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tipo_Pokemon {
    @Id
    private  Integer serial;
    private String descripcion;
    private Integer uuid;
}
