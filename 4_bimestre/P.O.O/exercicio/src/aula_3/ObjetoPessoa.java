package aula_3;

public class ObjetoPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Alice", 78.0);

        System.out.println(pessoa1.getNome());   // get carrega a informação
        System.out.println(pessoa1.getPeso());   // get carrega a informação
        pessoa1.setPeso(80D);
        System.out.println(pessoa1.getPeso());   // get carrega a informação

        pessoa1.andar(10.0);
        pessoa1.andar(35D);

        System.out.println("Horas dormidas " + pessoa1.dormir());


        Pessoa pessoa2 = new Pessoa("João", 90D);

        System.out.println(pessoa2.getNome());   // get carrega a informação
        System.out.println(pessoa2.getPeso());   // get carrega a informação
        pessoa2.andar(50D);

        System.out.println("Horas dormidas " + pessoa2.dormir());

    }
}