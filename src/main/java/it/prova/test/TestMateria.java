package it.prova.test;

import it.prova.model.MateriaPrima;
import it.prova.service.LavorazioneService;
import it.prova.service.MateriaPrimaService;
import it.prova.spring.MyServiceFactory;

public class TestMateria {

	public static void main(String[] args) {
		LavorazioneService lavService = MyServiceFactory.getLavorazionePrimaService();
		MateriaPrimaService matService = MyServiceFactory.getMateriaPrimaService();
		MateriaPrima materiaItem = matService.caricaMateriaPrima(2L);
		lavService.inviaInLavorazione(materiaItem);
		System.out.println(materiaItem);

	}

}
