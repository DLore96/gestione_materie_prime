package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;

@Service
public class LavorazioneServiceImpl implements LavorazioneService {

	@Autowired
	private AssemblaggioService assemblaService;
	@Autowired
	private VerniciaturaService verniciaturaService;
	@Autowired
	private MessaInOperaService messaInOperaService;

	@Autowired
	private ProntaService prontaService;

	@Override
	public void inviaInLavorazione(MateriaPrima input) {

		System.out.println("Inizio lavorazione........................");
		System.out.println("************************************");

		assemblaService.assembla(input);
		System.out.println(input);
		System.out.println("Assemblato ...............");

		verniciaturaService.verniciatura(input);
		System.out.println(input);
		System.out.println("Verniciato..........");

		messaInOperaService.messaInOpera(input);
		System.out.println(input);
		System.out.println("Messo n opera.........");

		prontaService.pronto(input);
		System.out.println(input);
		System.out.println("PRONTA");

	}

}
