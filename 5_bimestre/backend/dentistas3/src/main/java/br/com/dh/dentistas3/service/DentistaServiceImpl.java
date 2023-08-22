package br.com.dh.dentistas3.service;

import br.com.dh.dentistas3.domain.Dentista;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class DentistaServiceImpl implements DentistaService{
    @Override
    public List<Dentista> listaDentistas(){
        return Arrays.asList(new Dentista("Maria"), new Dentista("João"));
    }
}
