package com.example.ParcialFinalWeb.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class Pokemon {

    @Id
    @SequenceGenerator(name = "pokemon_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_id_seq")
    private Integer serial;
    private String nombre;
    private String descripcion;
    private Integer tipo_pokemon;
    private Date fecha_descubrimiento;
    private Integer generacion;
    private String uuid;

    @ManyToOne
    @JoinColumn(name="entrenador")
    private Entrenador entrenador;
}


