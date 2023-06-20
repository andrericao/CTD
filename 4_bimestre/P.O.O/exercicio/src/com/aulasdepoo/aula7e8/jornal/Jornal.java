package com.aulasdepoo.aula7e8.jornal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jornal {

    private String editor;
    private LocalDate data;
    private ArrayList<Revista> revstas = new ArrayList<>();

    public Jornal(String editor, LocalDate data) {
        this.editor = editor;
        this.data = data;
    }
}