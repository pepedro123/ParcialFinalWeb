package com.example.ParcialFinalWeb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Entrenador {
    private Integer serial;
    private String nombre;
    private String apellido;
    private String email;
    private Date fecha_nacimiento;
    private Date fecha_vinculacion;
    private Integer pueblo_id;
    private String uuid;
    private Pokemon pokemon;
    @JsonIgnore
    @OneToMany(mappedBy="pokemon")
    private List<Pokemon> pokemons;

}
