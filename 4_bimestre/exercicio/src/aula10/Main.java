package aula10;

public class Main {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ronaldo", "0254159952556", 9.5);
        Empregado empregado1 = new Empregado("Luiz", "025.158.698-58", 5000.00, 200.00, "ARQ 1");

        //metodo sobrescrito na subclasse
        aluno1.calcularImc(19.5);
        empregado1.altura = 1.80;
        empregado1.peso = 82D;
        empregado1.calcularImc(28.0);


        //sobrecarga
        System.out.println("Salário é: " + empregado1.calcularSalario(85.9,44.0));
        System.out.println("Salário é: " + empregado1.calcularSalario(50.0));

    }
}