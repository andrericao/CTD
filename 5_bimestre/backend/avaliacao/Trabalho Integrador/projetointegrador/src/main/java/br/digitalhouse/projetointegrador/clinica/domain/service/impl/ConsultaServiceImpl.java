package br.digitalhouse.projetointegrador.clinica.domain.service.impl;

import br.digitalhouse.projetointegrador.clinica.domain.entity.Consulta;
import br.digitalhouse.projetointegrador.clinica.domain.exception.BadRequestDataConsultaException;
import br.digitalhouse.projetointegrador.clinica.domain.exception.NotFoundException;
import br.digitalhouse.projetointegrador.clinica.domain.repository.ConsultaRepository;
import br.digitalhouse.projetointegrador.clinica.domain.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;

    @Autowired
    public ConsultaServiceImpl(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Override
    public Consulta criarConsulta(Consulta consulta) {

        if(consulta.getDataConsulta().isBefore(LocalDate.now())) {
            throw new BadRequestDataConsultaException(consulta.getDataConsulta());
        }
        return consultaRepository.save(consulta);
    }

    @Override
    public List<Consulta> buscarConsultas() {
        return consultaRepository.findAll();
    }

    @Override
    public Consulta buscarConsultaPorId(UUID id) {
        try {
            return consultaRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
    }

    @Override
    public Consulta atualizarConsulta(UUID id, Consulta consulta) {
        try {
            consultaRepository.findById(id).orElseThrow();;
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
        return consultaRepository.save(consulta);
    }

    @Override
    public void deletarConsulta(UUID id) {
        try {
            consultaRepository.findById(id).orElseThrow();
            consultaRepository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
    }
}
