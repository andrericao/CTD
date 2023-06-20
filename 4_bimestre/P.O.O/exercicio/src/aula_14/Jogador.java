package aula_14;

/*	- Coleções são um grupo de objetos ou itens. Usado no relacionmamento de 1
 para n ou n para n.
	Metodos disponiveis:
		-adicionar: add ou put(Object o)
		-deletar: remove (Object o)
		-tamanho: size()
		-obter: interator() -> percorre a lista. Mantém qualquer informação
		de estado necessária para saber até onde a iteração (caminhamento)
		já foi (mantém o cursor)


	- Set: não permite elementos duplicados, para isso é necessário implementar equals and hashCod
	- List: permite itens duplicados
	- Maps: associa chaves a valores, chaves não duplicáveis e pode ter um valor só maximo associado
	*/

//import javax.activity.ActivityRequiredException;
import java.util.ArrayList;

public class Jogador implements Comparable<Jogador>{

    private int numeroCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;


    public Jogador(int numeroCamisa, String nome, boolean lesionado, boolean titular) {
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    //utilizado em algumas colletions pra ordenação de listas com .sort
    /*Considerando que queremos ordenar pelo número da camisa, a classe Jogador implementa a interface
    .java.lang.Comparable que define o que será nossa "ordem natural".
    A interface possui apenas um método compareTo
    Se o número da camisa atual é menor do que da outraCamisa (parâmetro) retormamos -1
    (ou qualquer int negativo, indicando que this deve vir "antes" de outraCamisa),
    se for maior retornamos 1 (ou qualquer int positivo) e se for igual então devolvemos 0.*/
    @Override
    public int compareTo(Jogador o) {
        if (this.numeroCamisa ==  o.numeroCamisa){
            // System.out.println("O número da camisa " + this.numeroCamisa + " é igual ao da camisa " + o.numeroCamisa);
            return 0; //se iguais retorna 0
        }else if (this.numeroCamisa <  o.numeroCamisa){
            //System.out.println("O número da camisa " + this.numeroCamisa + " é menor que a camisa " + o.numeroCamisa);
            return -1; // se  this.numeroCamisa < o.numeroCamisa retorna um numero menor que 0
        }else{
            //System.out.println("O número da camisa " + this.numeroCamisa + " é maior que a camisa " + o.numeroCamisa);
            return 1; // this.numeroCamisa > o.numeroCamisa retorna um numero maior que 0
        }
    }



    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}