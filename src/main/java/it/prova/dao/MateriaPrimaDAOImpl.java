package it.prova.dao;

import org.springframework.stereotype.Component;

import it.prova.model.MateriaPrima;

@Component
public class MateriaPrimaDAOImpl implements MateriaPrimaDAO {

	@Override
	public MateriaPrima get(Long id) {
		for (MateriaPrima materiaItem : DbMock.MATERIAPRIMA) {
			if (materiaItem.getId() == id)
				return materiaItem;
		}
		return null;
	}

	@Override
	public void aggiornaStato(MateriaPrima input) {
		for (MateriaPrima materiaItem : DbMock.MATERIAPRIMA) {
			if (materiaItem.getId() == input.getId()) {
				materiaItem.setDescrizione(input.getDescrizione());
				materiaItem.setStato(input.getStato());
			}

		}

	}

}
