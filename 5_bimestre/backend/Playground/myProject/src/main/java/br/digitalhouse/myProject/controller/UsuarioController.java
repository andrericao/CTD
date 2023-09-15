package br.digitalhouse.myProject.controller;

import br.digitalhouse.myProject.model.Usuario;
import br.digitalhouse.myProject.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario criarUsuario(){
        return usuarioService.criarUsuario("André", 32);
    }

    @GetMapping("/2")
    public Usuario criarUsuario2(){
        return usuarioService.criarUsuario("Nathalia", 28);
    }
}
