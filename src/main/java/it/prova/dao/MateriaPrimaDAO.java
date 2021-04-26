package it.prova.dao;

import it.prova.model.MateriaPrima;

public interface MateriaPrimaDAO {

	public MateriaPrima get(Long id);

	public void aggiornaStato(MateriaPrima input);

}
