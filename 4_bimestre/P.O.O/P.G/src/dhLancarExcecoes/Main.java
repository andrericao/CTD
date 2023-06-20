package dhLancarExcecoes;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        try {
            Data2 dt2 = new Data2(30, 13, 2022);
        } catch (DataException e) {
            System.err.println(e.getMessage());
        }
    }
}
