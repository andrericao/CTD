package br.digutalhouse.dentist.service;

import lombok.Setter;
import org.springframework.stereotype.Service;
import br.digutalhouse.dentist.domain.Dentist;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
@Service
public class DentistServiceImpl implements DentistService {

    @Override
    public List<Dentist> dentistList() {
        return Arrays.asList(
                new Dentist("Isabela"),
                new Dentist("Noah"));
    }
}
