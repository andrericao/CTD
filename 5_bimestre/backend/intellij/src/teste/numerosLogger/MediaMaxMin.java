package teste.numerosLogger;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class MediaMaxMin {
    public static void main(String[] args) {

        final Logger log = Logger.getLogger(MediaMaxMin.class);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(32);
        numeros.add(5);
        numeros.add(19);
        numeros.add(17);
        numeros.add(13);
        numeros.add(80);

        int menor = Collections.min(numeros);
        log.info("O menor número é " + menor);
        int maior = Collections.max(numeros);
        System.out.println(maior);
        int tamanho = numeros.size();
        System.out.println(tamanho);

        /*public int mediaNumeros(){
            int i;
                for(i = 0; i < numeros.size(); i++){
                    i += numeros.get(i);
                }
            int media = i / numeros.size();
            System.out.println(media);
        }*/
    }
}
