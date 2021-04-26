package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class ProntaServiceImpl implements ProntaService {

	@Autowired
	private MateriaPrimaService materiaService;

	@Override
	public void pronto(MateriaPrima input) {
		input.setStato(StatoMateria.PRONTA);
		materiaService.aggiorna(input);
		System.out.println("pronto");
	}

}
