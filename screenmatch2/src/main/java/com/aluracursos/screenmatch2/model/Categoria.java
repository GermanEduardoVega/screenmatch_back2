package com.aluracursos.screenmatch2.model;

public enum Categoria {     //realiza la conversión entre la información de OMDB y la de nuestra aplicación
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMEN("Crime");
    private String categoriaOmbd;

    //Constructor   //tratamiento para las categorias de nuestras series
    Categoria(String categoriaOmbd){
        this.categoriaOmbd = categoriaOmbd;
    }
}


