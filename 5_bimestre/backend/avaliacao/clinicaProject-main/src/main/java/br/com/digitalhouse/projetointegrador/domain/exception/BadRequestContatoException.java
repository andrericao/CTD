package br.com.digitalhouse.projetointegrador.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestContatoException extends RuntimeException{
    public BadRequestContatoException() {
        super("Email e Telefone estão nulos!");
    }

}
