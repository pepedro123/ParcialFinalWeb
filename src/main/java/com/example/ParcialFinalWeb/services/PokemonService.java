package com.example.ParcialFinalWeb.services;

import com.example.ParcialFinalWeb.entities.Entrenador;
import com.example.ParcialFinalWeb.entities.Pokemon;
import com.example.ParcialFinalWeb.repositories.EntrenadorRepository;
import com.example.ParcialFinalWeb.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public ResponseEntity<?> agregarPokemonAEntrenador(String uuidPokemon, String uuid) {

        Optional<Entrenador> optionalEntrenador = entrenadorRepository.findByUuid(uuid);

        if (optionalEntrenador.isPresent()) {
            Entrenador entrenador = optionalEntrenador.get();


            boolean pokemonYaAsociado = entrenador.getPokemons().stream()
                    .anyMatch(pokemon -> pokemon.getUuid().equals(uuidPokemon));

            if (pokemonYaAsociado) {
                return ResponseEntity.badRequest().body(Map.of("error", true, "message", "El Pokémon ya está registrado al entrenador"));
            }


            Optional<Pokemon> optionalPokemon = pokemonRepository.findByUuid(uuid);

            if (optionalPokemon.isPresent()) {
                Pokemon pokemon = optionalPokemon.get();


                pokemon.setEntrenador(entrenador);


                entrenador.getPokemons().add(pokemon);


                entrenadorRepository.save(entrenador);


                return ResponseEntity.ok(entrenador.getPokemons());
            } else {
                return ResponseEntity.notFound().build();
            }
        } else {

            return ResponseEntity.notFound().build();
        }
    }
}
