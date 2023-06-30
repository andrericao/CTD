package checkpoint_ii;

public class ClienteCadastroException extends Exception{
    public ClienteCadastroException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

