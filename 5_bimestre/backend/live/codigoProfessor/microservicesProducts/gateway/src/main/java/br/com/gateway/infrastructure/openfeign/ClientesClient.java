package br.com.gateway.infrastructure.openfeign;

import br.com.gateway.api.controller.dto.response.ClienteResponse;
import br.com.gateway.api.controller.dto.response.ProdutoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// caminho em resources -> application.properties
// Simula variável de ambiente
@FeignClient(name = "clientes")
public interface ClientesClient {

    @GetMapping("v1/clientes")
    ResponseEntity<List<ClienteResponse>> buscarTodosOsClientes();

    @GetMapping("v1/clientes/{id}")
    public ResponseEntity<ClienteResponse> buscarClientePorId(String id);
}
