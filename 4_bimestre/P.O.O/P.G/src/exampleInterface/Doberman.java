package exampleInterface;

public class Doberman implements Cuidador, Latido {
    public String guarda(){
        return "Estou atento guardando a casa";
    }
    public String latir(){
        return "Guau! Guau!";
    }
}


