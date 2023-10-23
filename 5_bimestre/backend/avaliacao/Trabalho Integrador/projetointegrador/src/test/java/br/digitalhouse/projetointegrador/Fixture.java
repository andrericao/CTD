package br.digitalhouse.projetointegrador;

import br.digitalhouse.projetointegrador.clinica.api.dto.request.ClinicaRequest;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.ContatoRequest;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.EnderecoRequest;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.PacienteRequest;
import br.digitalhouse.projetointegrador.clinica.domain.entity.SexoEnum;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public final class Fixture {

    private static final Faker FAKER = new Faker(new Locale("pt", "BR"));

    public static class PacienteFake {
        public static PacienteRequest anyPaciente() {

            PacienteRequest request = new PacienteRequest();
            request.setNome(FAKER.gameOfThrones().character());
            request.setDataNascimento(LocalDate.now());
            request.setSexo(SexoEnum.M);

            ContatoRequest contatoRequest = new ContatoRequest();
            contatoRequest.setEmail(FAKER.internet().emailAddress());
            contatoRequest.setTelefone(FAKER.regexify("\\(?\\d{2}\\)?\\s?\\d{4,5}\\-?\\d{4}"));
            request.setContato(contatoRequest);

            EnderecoRequest enderecoRequest = new EnderecoRequest();
            enderecoRequest.setLogradouro(FAKER.address().streetAddress());
            enderecoRequest.setBairro(FAKER.address().secondaryAddress());
            enderecoRequest.setCidade(FAKER.address().cityName());
            enderecoRequest.setEstado(FAKER.address().stateAbbr());
            enderecoRequest.setCep(FAKER.address().zipCode());
            request.setEndereco(enderecoRequest);

            return request;
        }
    }

    public static class ClinicaFake{

        public static ClinicaRequest anyClinica() {

            ClinicaRequest request = new ClinicaRequest();

            request.setNome(FAKER.company().name());
            request.setCnpj("99.999.999/9999-99"); //(FAKER.regexify("\\d{2}\\.?\\d{3}\\.?\\d{3}\\/?\\d{4}\\-?\\d{2}"));
            request.setRazaoSocial(FAKER.pokemon().name());
            request.setDescricao(FAKER.lorem().paragraph());

            ContatoRequest contatoRequest = new ContatoRequest();
            contatoRequest.setEmail(FAKER.internet().emailAddress());
            contatoRequest.setTelefone(FAKER.regexify("\\(?\\d{2}\\)?\\s?\\d{4,5}\\-?\\d{4}"));
            request.setContato(contatoRequest);

            EnderecoRequest enderecoRequest = new EnderecoRequest();
            enderecoRequest.setLogradouro(FAKER.address().streetAddress());
            enderecoRequest.setBairro(FAKER.address().secondaryAddress());
            enderecoRequest.setCidade(FAKER.address().cityName());
            enderecoRequest.setEstado(FAKER.address().stateAbbr());
            enderecoRequest.setCep(FAKER.address().zipCode());
            request.setEndereco(enderecoRequest);

            return request;

        }
    }
}
