package com.example.ParcialFinalWeb.repositories;

import com.example.ParcialFinalWeb.entities.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {
    public List<Entrenador> findByEmail(String email);
}
