package jcbd.conta_db;

import jcbd.conta_db.db.ContaRepository;
import jcbd.conta_db.model.Conta;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{
        log.info("Funcionou");

        Conta conta = new Conta("André e Nathalia", "0000-0000-0000-0000", 100);
        String contaId = conta.getId();

        ContaRepository repository = new ContaRepository();
        repository.criarConta(conta);

        Conta contaConsultada = repository.buscaContaPorId(contaId);
        log.info("Conta encontrada: " + contaConsultada);

        repository.excluiContaPorId(contaId);

        Conta contaQueNaoExiste = repository.buscaContaPorId(contaId);
        log.info("Buscando conta que não existe: " + contaQueNaoExiste);
    }

}
