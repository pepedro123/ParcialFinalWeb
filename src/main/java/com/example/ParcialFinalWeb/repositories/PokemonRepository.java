package com.example.ParcialFinalWeb.repositories;

import com.example.ParcialFinalWeb.entities.Entrenador;
import com.example.ParcialFinalWeb.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    public List<Entrenador> findByUuid(Integer uuid);
}
