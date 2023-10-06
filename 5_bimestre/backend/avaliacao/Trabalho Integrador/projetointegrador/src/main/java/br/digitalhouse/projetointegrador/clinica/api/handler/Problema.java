package br.digitalhouse.projetointegrador.clinica.api.handler;

public record Problema(Integer status,
                       String message,
                       String detail) {
}
