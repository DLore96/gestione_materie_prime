package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Autowired
	private MateriaPrimaService materiaService;

	@Override
	public void messaInOpera(MateriaPrima input) {
		input.setStato(StatoMateria.IN_MESSA_IN_OPERA);
		materiaService.aggiorna(input);
		System.out.println("messo in opera");
	}

}
