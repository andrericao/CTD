package br.digitalhouse.projetointegrador;

import br.digitalhouse.projetointegrador.clinica.ProjetoClinicaApplication;
import br.digitalhouse.projetointegrador.clinica.api.controller.ClinicaController;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.ClinicaRequest;
import br.digitalhouse.projetointegrador.clinica.domain.service.ClinicaService;
import br.digitalhouse.projetointegrador.clinica.domain.service.PacienteService;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.PacienteRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
//@WebMvcTest(ClinicaController.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
@SpringBootTest(classes = ProjetoClinicaApplication.class)
class ProjetoClinicaApplicationTests {

	@SpyBean
	private PacienteService pacienteService;

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(mvc);
	}

	@Test
	@DisplayName("Dado um objeto válido, quando chamamos o endpoint criar Pacientes, retornar o Objeto Mockado")
	void dadoUmObjetoValido_quandoChamamosEndpointCriarPaciente_entaoRetornarObjetoMockado() throws Exception {

		PacienteRequest paciente = Fixture.PacienteFake.anyPaciente();

		String pacienteAsJson = objectMapper.writeValueAsString(paciente);

		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post("/v1/pacientes")
				.content(pacienteAsJson)
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON);

		this.mvc.perform(request)
				.andDo(print())
				.andExpect(status().isOk());

	}

	@Test
	@DisplayName("Dado uma lista vazia, quando chamamos o endpoint buscar Pacientes, retornar uma lista vazia")
	void dadoUmaListaVazia_quandoChamamosEndpointBuscarPacientes_entaoRetornarListaVazia() throws Exception {
		Mockito.when(pacienteService.buscarPacientes(Mockito.any()))
				.thenReturn(new ArrayList<>());

		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.get("/v1/pacientes")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON);

		this.mvc.perform(request)
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json"));
	}

	@Test
	@DisplayName("Dado um objeto válido, quando chamamos o endpoint criar Clinicas, retornar o Objeto Mockado")
	void dadoUmObjetoValido_quandoChamamosEndpointCriarClinica_entaoRetornarObjetoMockado() throws Exception{

		ClinicaRequest clinica = Fixture.ClinicaFake.anyClinica();

		String clinicaAsJson = objectMapper.writeValueAsString(clinica);

		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post("/v1/clinicas")
				.content(clinicaAsJson)
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON);

		this.mvc.perform(request)
				.andDo(print())
				.andExpect(status().isOk());
	}
}
