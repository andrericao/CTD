package exampleMapArrays;

import java.util.HashMap;

public class ExampleMapArrays {
    public static void main(String[] args) {

        HashMap<String, Integer> nomeIdade = new HashMap<>();

        nomeIdade.put("André", 32);

        System.out.println(nomeIdade.containsKey("André"));
    }
}
