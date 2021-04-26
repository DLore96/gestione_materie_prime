package it.prova.service;

import it.prova.model.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima caricaMateriaPrima(Long id);

	public void aggiorna(MateriaPrima input);

}
