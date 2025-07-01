package com.aluracursos.screenmatch2.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMEN("Crime");
    private String categoriaOmdb;

    //Constructor   //tratamiento para las categorias de nuestras series
    Categoria(String categoriaOmdb){

        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {   //realiza la conversión entre la información de OMDB y la de nuestra aplicación
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }
}


