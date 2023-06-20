package aula_10;

import java.util.ArrayList;

//classe Aluno herda da classe Pessoa pelo extends. É uma classe filha, onde fica a especialização.
//Observe que a classe vazia já da erro e pede pra implementar um construtor com o super
public class Aluno extends Pessoa{

    private Double nota;
    private ArrayList<Turma> listaTurmas = new ArrayList<Turma>();

    public Aluno(String nome, String cpf, Double nota) {
        //super é responsável por invocar o Contrutor da classe Pessoa que é a classe pai ou superclasse
        super(nome, cpf);
        this.nota = nota;
    }

    public void adicionarAluno(Turma turma){
        listaTurmas.add(turma);
    }

    //get e set

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(ArrayList<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}