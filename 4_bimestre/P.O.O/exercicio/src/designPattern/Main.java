package designPattern;


public class Main {

    public static void main(String[] args) {
        EmpregadoFactory empregadoFactory = EmpregadoFactory.getInstance();

        Empresa empresa = new Empresa ("125369820100114");
        empresa.addEmpregado(empregadoFactory.criarEmpregado("EMP-INT", "JosÃ©", "Souza", "1", 5000.00));
        empresa.addEmpregado(empregadoFactory.criarEmpregado("EMP-EXT", "Rodrigo", "Moura", "12", null));

        empresa.lerEmpregado(30);
        empresa.calcularSalarioTotal(30);
    }
}