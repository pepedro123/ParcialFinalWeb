package com.example.ParcialFinalWeb.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Entrenador {
    private Integer serial;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private Date fecha_vinculacion;
    private Integer pueblo_id;
    private String uuid;
}
