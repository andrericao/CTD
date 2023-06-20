package pacientesException;

public class PacienteException extends Exception {

    public PacienteException (String mensagem) {
        super(mensagem);
    }
    @Override
    public String toString(){
        return getMessage();
    }

}
