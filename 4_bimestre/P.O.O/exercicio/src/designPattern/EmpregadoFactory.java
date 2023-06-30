package designPattern;

public class EmpregadoFactory {


    //Padrão Singleton: é um design pattern criacional que garante que essa classe só tenha UMA instancia de define um ponto de acesso
    // global a ela.
    //quando uma classe não vai ser instanciada fora dela mesma (nem subclasses instanciam) e mais que uma vez.
    // Ex: classe de conexão com banco de dados.


    // Estático (static): é possível acessar em outra classe sem criar um objeto (new)
    //    É um atributo que será o mesmo em todos os lugares onde é acessado
    private static EmpregadoFactory instance;

    //Padrão Singleton: Todos os construtores da classe devem utilizar o
    // modificador private;

        /*Observe que o construtor é privado não permitindo a criação da classe de
        fora dela, e que temos um método getInstance que tem é estático e é esse
        mesmo método que verifica se o objeto instance que também deve ser estático
        já foi instanciado ou se é necessario criar a instancia e retorna o mesmo
        para a invocação do método.
        Bem, ocorre que os objetos a serem criados quando chamar a getInstance
        são uma referência o objeto estático que está dentro da classe, esse objeto
        é o único objeto instanciado no projeto, o que foi feito, foi criar um ponto
        global de acesso a esse objeto.*/

    //Padrão Singleton: Criar um método estático getInstance() que retorna
    // o atributo instance.

    public static EmpregadoFactory getInstance(){
        if (instance == null){
            instance = new EmpregadoFactory();
        }
        return instance;
    }



    //Padrão Factory: um dos principais e mais utilizados. O padrão Factory Method é frequentemente usado quando você
    // tem uma hierarquia de classes e deseja delegar a criação de objetos para as subclasses ou agrupar em determinada classe.
    public Empregado criarEmpregado(String tipo, String nome, String sobrenome, String arquivo, Double salario){
        if(tipo.equalsIgnoreCase("EMP-INT")) {
            System.out.println("EMP-INT");
            EmpregadoRelacaoDep  empregadoRelacaoDep = new EmpregadoRelacaoDep(nome, sobrenome, arquivo, salario);
            return empregadoRelacaoDep;
        }else if(tipo.equalsIgnoreCase("EMP-EXT")){
            System.out.println("EMP-EXT");
            EmpregadoContratado empregadoContratado = new EmpregadoContratado(nome, sobrenome, arquivo);
            empregadoContratado.setImposto(5.0);
            empregadoContratado.setValorPorHora(150.00);
            return empregadoContratado;
        }else{
            return null;
        }
    }
}
