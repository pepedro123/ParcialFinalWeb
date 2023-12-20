package com.example.ParcialFinalWeb.repositories;

import com.example.ParcialFinalWeb.entities.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EntrenadorRepository extends JpaRepository<Entrenador, String> {
    public Optional<Entrenador> findByUuid(String uuid);


}
