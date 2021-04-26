package it.prova.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.model.MateriaPrima;
import it.prova.model.StatoMateria;

public class DbMock {

	public static final List<MateriaPrima> MATERIAPRIMA = new ArrayList<MateriaPrima>();

	static {
		MateriaPrima materia1 = new MateriaPrima(1L, "bohmateria", StatoMateria.PRONTA);
		MATERIAPRIMA.add(materia1);
		MateriaPrima materia2 = new MateriaPrima(2L, "stronzio", StatoMateria.PRONTA);
		MATERIAPRIMA.add(materia2);
		MateriaPrima materia3 = new MateriaPrima(1L, "silicio", StatoMateria.IN_INSERIMENTO);
		MATERIAPRIMA.add(materia3);

	}

}
