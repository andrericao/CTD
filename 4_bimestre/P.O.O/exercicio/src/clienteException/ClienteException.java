package clienteException;

public class ClienteException extends Exception{

    // por padrão se cria um construtor vazio para garantir que todas as exceções
    // serão capturadas, caso não defina nenhuma mensagem
    // public ClienteException(){ }

    //Construtor com parâmetro String para personalizar as mensagens
    public ClienteException(String mensagem){
        super(mensagem);
    }

    //sobrescrever o método toString pra retornar
    @Override
    public String toString() {
        return getMessage();
    }

    /*printStackTrace() - Imprime em tela a pilha de execução, usado para auxiliar no
    diagnóstico de erros.
    getMessage() - Retorna uma String com a mensagem contida na exceção.
    getClass() - Retorna uma String com o nome complete da classe da exceção.*/
}
