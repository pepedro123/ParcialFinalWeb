package com.example.ParcialFinalWeb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Captura {
    @Id
    private Integer serial;
    private Integer pokemon_id;
    private Integer entrenador_id;
}
