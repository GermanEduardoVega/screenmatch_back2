package com.aluracursos.screenmatch2.model.repository;

import com.aluracursos.screenmatch2.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);


    List<Serie> findTop5ByOrderByEvaluacionDesc();
}
