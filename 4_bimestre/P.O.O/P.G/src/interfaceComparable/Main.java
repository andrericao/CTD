package interfaceComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Sabrina", 22);
        Pessoa p2 = new Pessoa("Cinthia", 30);
        Pessoa p3 = new Pessoa("André", 32);
        Pessoa p4 = new Pessoa("Nathalia", 28);
        Pessoa p5 = new Pessoa("Noah", 3);

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p4);
        listaPessoas.add(p3);
        listaPessoas.add(p5);

        System.out.println("=========== Lista Desorganizada =============");

        for(Pessoa p: listaPessoas) {
            System.out.println(p.toString());
        }

        System.out.println("=========== Lista Organizada ================");

        Collections.sort(listaPessoas);
        for(Pessoa p: listaPessoas){
            System.out.println(p.toString());
        }
    }
}
