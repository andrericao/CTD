package pacientes;

public class PacientesException extends Exception{
    public PacientesException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
