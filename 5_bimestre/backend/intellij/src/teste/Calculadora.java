package teste;

public class Calculadora {

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
        try {
            return valor1 / valor2;
        } catch (Exception e){
            return 0;
        }
    }
}

