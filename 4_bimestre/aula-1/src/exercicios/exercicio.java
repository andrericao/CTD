package exercicios;

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira seu nome");

    String nome = scanner.nextLine();

    System.out.println("O nome inserido foi: " + nome + ", agora insira seu sobrenome");

    String sobrenome = scanner.nextLine();

    System.out.println("Prazer " + nome + " " + sobrenome + " Agora me diz que dia você nasceu");

    int dia = scanner.nextInt();

    System.out.println("De que mês?");

    int mes = scanner.nextInt();

    System.out.println("E em que ano?");

    int ano = scanner.nextInt();

    char inicialNome = nome.charAt(0);
    char inicialSobrenome = sobrenome.charAt(0);

    System.out.println(" Resolução do exercício -> Nome: " + nome + " " + sobrenome + " BLZ! As iniciais do nome são: "
            + inicialNome + "." + inicialSobrenome + ". / data de nascimento: " + dia + " / " + mes +" / "+ ano + ".");

    };

};
