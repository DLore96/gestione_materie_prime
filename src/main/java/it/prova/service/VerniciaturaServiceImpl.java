package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class VerniciaturaServiceImpl implements VerniciaturaService {

	@Autowired
	private MateriaPrimaService materiaService;

	@Override
	public void verniciatura(MateriaPrima input) {
		input.setStato(StatoMateria.IN_VERNICIATURA);
		materiaService.aggiorna(input);
		System.out.println("verniciato");
	}

}
