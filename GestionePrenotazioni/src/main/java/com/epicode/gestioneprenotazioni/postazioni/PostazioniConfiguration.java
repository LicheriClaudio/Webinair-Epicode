package com.epicode.gestioneprenotazioni.postazioni;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.sede.Sede;



@Configuration
public class PostazioniConfiguration {

	@Bean("postazioni")
	public Postazioni creaPostazioni() {return new Postazioni("sad34gd21", "accogliente postazione antica", 15, Tipo.OPENSPACE, null, null);}
	@Bean("postazioni2")
	public Postazioni creaPostazioni1() {return new Postazioni("asd87gd54", "rustico postazione moderna", 5, Tipo.PRIVATO, null, null);}
	@Bean("postazioni3")
	public Postazioni creaPostazioni2() {return new Postazioni("wqd76ha79", "stanza  per riunioni", 31, Tipo.AREARIUNIONI, null, null);}

}
