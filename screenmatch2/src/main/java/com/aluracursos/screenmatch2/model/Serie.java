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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public void setTotalDeTemporadas(Integer totalDeTemporadas) {
        this.totalDeTemporadas = totalDeTemporadas;
    }

    public Double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

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
