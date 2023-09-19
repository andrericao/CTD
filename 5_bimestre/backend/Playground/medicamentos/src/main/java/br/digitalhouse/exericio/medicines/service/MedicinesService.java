package br.digitalhouse.exericio.medicines.service;

import br.digitalhouse.exericio.medicines.dao.IDao;
import br.digitalhouse.exericio.medicines.model.Medicines;

public class MedicinesService {
    private IDao<Medicines> medicinesIDao;

    public MedicinesService(IDao<Medicines> medicinesIDao){
        this.medicinesIDao = medicinesIDao;
    }

    public Medicines save(Medicines medicines){
        return medicinesIDao.save(medicines);
    }

    public Medicines fetchById(Integer id){
        return medicinesIDao.fetchById(id);
    }
}
