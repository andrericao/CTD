package dhLancarExcecoes;

public class DataException extends Exception{

    public DataException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString(){
        return "Os valores devem estar dentro dos números para dia, mês e ano";
    }
}
