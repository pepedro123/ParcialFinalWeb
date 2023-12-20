package com.example.ParcialFinalWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class Pokemon {

    @Id
    private Integer serial;
    private String nombre;
    private String descripcion;
    private Integer tipo_pokemon;
    private Date fecha_descubrimiento;
    private Integer generacion;
    private String uuid;
}
