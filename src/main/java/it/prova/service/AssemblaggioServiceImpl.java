package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	@Autowired
	private MateriaPrimaService materiaService;

	@Override
	public void assembla(MateriaPrima input) {
		input.setStato(StatoMateria.IN_ASSEMBLAGGIO);
		materiaService.aggiorna(input);
		System.out.println("assemblato");
	}

}
