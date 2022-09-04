package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class PrenotazioniConfiguration {

	@Bean("prenotazione")
	public Prenotazioni creaPrenotazioni() {return new Prenotazioni(LocalDate.now(), null, null);}
	@Bean("prenotazione2")
	public Prenotazioni creaPrenotazioni1() {return new Prenotazioni(LocalDate.now(), null, null);}
	@Bean("prenotazione3")
	public Prenotazioni creaPrenotazioni2() {return new Prenotazioni(LocalDate.now(), null, null);}

}
