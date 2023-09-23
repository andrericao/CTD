package br.digitalhouse.exercise.apiconsuption;

import br.digitalhouse.exercise.apiconsuption.dto.DentistListResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ApiconsuptionApplication {

	public static void main(String[] args) throws UnirestException, JsonProcessingException {
		SpringApplication.run(ApiconsuptionApplication.class, args);
		log.info("I'm running a message!");

		// Iremos consumir a API de dentistas
		// ENDPOINT: https://staging-olimpo-dentistas-backend.bonnasys.com/v1/dentistas
		// URL da API https://staging-olimpo-dentistas-backend.bonnasys.com/swagger-ui/index.html
		// Usar unirest

		String ENDPOINT = "https://staging-olimpo-dentistas-backend.bonnasys.com/v1/dentistas";
		HttpResponse<String> response = Unirest
				.get(ENDPOINT)
				.asObject(String.class);

		ObjectMapper objectMapper = new ObjectMapper();

		DentistListResponse dentistas = objectMapper
				.readValue(response.getBody(), DentistListResponse.class);

		log.info("""
    				\n-------------------- STATUS DA REQUISIÇÃO --------------------
    				status: %s
    				status como texto: %s
    				headers: %s
    			""".formatted(response.getStatus(), response.getStatusText(), response.getHeaders()));

		dentistas.getDentistas().stream().forEach(dentista -> {

			log.info("""
          				\n-----------------------------
     					Destist:
     						id: %s
     						name: %s
     						registration: %s 					 
					""".formatted(dentista.getId(), dentista.getNome(), dentista.getMatricula()));
		});
	}

}
