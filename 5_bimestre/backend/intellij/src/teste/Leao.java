package teste;

import org.apache.log4j.Logger;

public class Leao {

    private static final Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;
    private boolean eAlfa;

    public Leao(String nome, int idade, boolean eAlfa){
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

    public Leao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void correr(){
        logger.info("O leão " + nome + " está correndo!");
    };

    public void eMaiorQue10(){
        if(idade > 20) {
            logger.error("A idade de " + nome + " está incorreta");
        } else if(idade > 10){
            logger.info("O leão " + nome + " é Alfa!");
        } else if (idade < 0){
            logger.error("A idade não pode ser negativa!");
        }
    }
}

