package teste;

import org.apache.log4j.Logger;

public class Calculadora {

    private static final Logger logger = Logger.getLogger(Calculadora.class);
    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somar(){
        return valor1 + valor2;
    }

    public int subtrair(){
        return valor1-valor2;
    }

    public int multiplicar(){
        return valor1 * valor2;
    }

    public int dividir(){
        logger.info("Tentativa de Divisão: " + valor1 + "/" + valor2);
        try {
            logger.debug("Try da Divisão");
            return valor1 / valor2;
        } catch (Exception e){
            logger.error("Divisão deu ruim: ", e);
            return 0;
        }
    }
}

