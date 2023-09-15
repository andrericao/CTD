package br.digitalhouse.myProject.service;

import br.digitalhouse.myProject.model.Usuario;

// ============ SEGUNDA CLASSE CRIADA ============
// Importamos o usuário da classe Ususrio dentro de model
// Criamos um método que recebe dois parametros
// Esses paramos são usados para instanciar a classe importada (a Usuario de model)
public class UsuarioService {

    public Usuario criarUsuario(String name, int age){
        Usuario usuario = new Usuario(name, age);
        return usuario;
    }
}
