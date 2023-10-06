package br.com.digitalhouse.projetointegrador.api.handler;

public record Problema(Integer status,
                       String message,
                       String detail) {
}
