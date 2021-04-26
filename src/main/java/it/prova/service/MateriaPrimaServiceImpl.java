package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.dao.MateriaPrimaDAO;
import it.prova.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {
	@Autowired
	private MateriaPrimaDAO materiaDAO;

	@Override
	public MateriaPrima caricaMateriaPrima(Long id) {

		return materiaDAO.get(id);
	}

	@Override
	public void aggiorna(MateriaPrima input) {
		materiaDAO.aggiornaStato(input);

	}

}
