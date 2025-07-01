package com.aluracursos.screenmatch2.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalDeTemporadas;
    private Double evaluacion;
    private String poster;
    private Categoria genero;
    private String actores;
    private String sinopsis;

    public Serie(DatosSerie datosSerie){    //referencia datosSerie para conseguir crear una serie del record
        this.titulo = datosSerie.titulo();
        this.totalDeTemporadas = datosSerie.totalDeTemporadas();
        this.evaluacion = OptionalDouble.of(Double.valueOf(datosSerie.evaluacion())).orElse(0);     //transformacion de datos series de string al double
        this.poster = datosSerie.poster();
        //this.genero = datosSerie.genero();
        this.genero = Categoria.fromString(datosSerie.genero()
                                                     .split(",")[0]       // realiza la separacion , punto de quiebre la , usa el primero
                                                     .trim());                  //no traiga ningun valor vacio

        this.actores = datosSerie.actores();
        this.sinopsis = datosSerie.sinopsis();
        //this.sinopsis = ConsultaChatGPT.obtenerTraduccion(datosSerie.sinopsis()) ;
    }
}
