package com.example.ParcialFinalWeb.repositories;

import com.example.ParcialFinalWeb.entities.Entrenador;
import com.example.ParcialFinalWeb.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    public Optional<Pokemon> findByTipopokemon(Integer tipo_pokemon);
    public Optional<Pokemon> findByUuid(String uuid);
}
