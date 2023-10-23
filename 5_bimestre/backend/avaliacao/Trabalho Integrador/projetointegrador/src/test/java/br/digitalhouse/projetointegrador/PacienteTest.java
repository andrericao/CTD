package br.digitalhouse.projetointegrador;

import br.digitalhouse.projetointegrador.clinica.ProjetoClinicaApplication;
import br.digitalhouse.projetointegrador.clinica.api.controller.PacienteController;
import br.digitalhouse.projetointegrador.clinica.api.dto.request.PacienteRequest;
import br.digitalhouse.projetointegrador.clinica.domain.service.PacienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest(classes = ProjetoClinicaApplication.class)
@WebMvcTest(PacienteController.class)
class PacienteTest {

    //@SpyBean
    @MockBean
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
}
