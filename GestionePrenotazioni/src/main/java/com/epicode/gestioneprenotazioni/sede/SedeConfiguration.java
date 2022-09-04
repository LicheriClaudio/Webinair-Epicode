package com.epicode.gestioneprenotazioni.sede;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.utente.Utente;

@Configuration
public class SedeConfiguration {
	
	@Bean("sede")
	public Sede creaSede() {return new Sede("Google","Via Del Pianto", "Roma");}
	@Bean("sede2")
	public Sede creaSede1() {return new Sede("Tesla","Via Del Babbuino", "Roma" );}
	@Bean("sede3")
	public Sede creaSede2() {return new Sede("Contrader","Via Le Mani", "Benevento");}

}
