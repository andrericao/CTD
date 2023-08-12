package teste.animais;

import org.apache.log4j.Logger;

public class Tigre {

    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nome;
    private int idade;

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void correr(){
        logger.error("O tigre está correndo!");
    };
}
