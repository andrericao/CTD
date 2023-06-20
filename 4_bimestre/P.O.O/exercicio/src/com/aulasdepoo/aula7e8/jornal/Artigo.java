package com.aulasdepoo.aula7e8.jornal;

import java.time.LocalDate;

public class Artigo {

    private String titulo;
    private String assunto;
    private String autor;
    private LocalDate data;

    public Artigo(String titulo, String assunto, String autor, LocalDate data) {
        this.titulo = titulo;
        this.assunto = assunto;
        this.autor = autor;
        this.data = data;
    }
}