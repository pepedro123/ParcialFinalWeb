package com.example.ParcialFinalWeb.controller;

import com.example.ParcialFinalWeb.entities.Entrenador;
import com.example.ParcialFinalWeb.entities.Pokemon;
import com.example.ParcialFinalWeb.repositories.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {
    @Autowired
    EntrenadorRepository entrenadorRepository;
    public List<Entrenador> getEntrenadorAll() {

        List<Entrenador> entrenador = entrenadorRepository.findAll();
        return entrenador;
    }
@GetMapping("/login/{email}")
public Entrenador getEmail(@PathVariable String email){

    Optional<Entrenador> entrenador = entrenadorRepository.findById(email);

    if (entrenador.isEmpty()) {
        return null;
    }

    return entrenador.get();
}
@GetMapping("/login/{uuid}/pokemon")
public Entrenador getPokemon(@PathVariable String uuid){

    Optional<Entrenador> entrenador = entrenadorRepository.findByUuid(uuid);
return entrenador.get();
}


    @PostMapping("/entredador/{uuid}/pokemon/{uuid}")
    public ResponseEntity<?> agregarPokemonAEntrenador(
            @PathVariable String uuidEntrenador,
            @PathVariable String uuidPokemon
    ) {
        EntrenadorController pokemonService = null;
        ResponseEntity<?> response = pokemonService.agregarPokemonAEntrenador(uuidEntrenador, uuidPokemon);
        return response;
    }
}
