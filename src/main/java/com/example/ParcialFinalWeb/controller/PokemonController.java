package com.example.ParcialFinalWeb.controller;

import com.example.ParcialFinalWeb.entities.Entrenador;
import com.example.ParcialFinalWeb.entities.Pokemon;
import com.example.ParcialFinalWeb.repositories.EntrenadorRepository;
import com.example.ParcialFinalWeb.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    PokemonRepository pokemonRepository;
    public List<Pokemon> getPokemonAll() {

        List<Pokemon> pokemon = pokemonRepository.findAll();
        return pokemon;
    }
    @GetMapping("/pokemon/{tipo}")
    public Pokemon getTipo_pokemon(@PathVariable Integer tipo_pokemon){

        Optional<Pokemon> pokemon = pokemonRepository.findByTipopokemon(tipo_pokemon);

        if (pokemon.isEmpty()) {
            return null;
        }

        return pokemon.get();
    }

    @PostMapping
    public Pokemon postPokemon(@RequestBody Pokemon pokemon) {

       pokemonRepository.save(pokemon);

        return pokemon;


    }




}
