package br.digitalhouse.projetointegrador.clinica.api.handler;

import br.digitalhouse.projetointegrador.clinica.domain.exception.BadRequestCnpjException;
import br.digitalhouse.projetointegrador.clinica.domain.exception.BadRequestContatoException;
import br.digitalhouse.projetointegrador.clinica.domain.exception.BadRequestDataConsultaException;
import br.digitalhouse.projetointegrador.clinica.domain.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Problema> notFoundExceptionHandler(NotFoundException e) {
        String message = "ID não encontrado no Sistema!";
        Problema problem = new Problema(HttpStatus.NOT_FOUND.value(), message, e.getMessage());
        return ResponseEntity.ok().body(problem);
    }

    @ExceptionHandler(BadRequestCnpjException.class)
    public ResponseEntity<Problema> badRequestExceptionHandler(BadRequestCnpjException e) {
        String message = "Clínica já existe!";
        Problema problem = new Problema(HttpStatus.BAD_REQUEST.value(), message, e.getMessage());
        return ResponseEntity.badRequest().body(problem);
    }

    @ExceptionHandler(BadRequestDataConsultaException.class)
    public ResponseEntity<Problema> badRequestCnpjException(BadRequestDataConsultaException e) {
        String message = "Data deve ser maior que a atual!";
        Problema problem = new Problema(HttpStatus.BAD_REQUEST.value(), message, e.getMessage());
        return ResponseEntity.badRequest().body(problem);
    }

    @ExceptionHandler(BadRequestContatoException.class)
    public ResponseEntity<Problema> badRequestContatoException(BadRequestContatoException e){
        String message = "Preencha pelo menos um dos campos de contato!";
        Problema problem = new Problema(HttpStatus.BAD_REQUEST.value(), message, e.getMessage());
        return ResponseEntity.badRequest().body(problem);
    }

}
