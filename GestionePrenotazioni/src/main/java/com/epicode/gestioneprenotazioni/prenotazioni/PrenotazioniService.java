package com.epicode.gestioneprenotazioni.prenotazioni;

import java.awt.desktop.UserSessionEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.apache.catalina.User;
import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;
import com.epicode.gestioneprenotazioni.postazioni.PostazioniRepository;
import com.epicode.gestioneprenotazioni.postazioni.PostazioniService;
import com.epicode.gestioneprenotazioni.sede.Sede;
import com.epicode.gestioneprenotazioni.utente.Utente;


@Service
public class PrenotazioniService {

	@Autowired
	private PrenotazioniRepository repo;
	

	
	public List<Prenotazioni> trovaTutti(){
		return (List<Prenotazioni>) repo.findAll();
		
	}

	public Prenotazioni trovaPerId(Long id) {
		return repo.findById(id).get();
		
	}
	public void cancella(Long id) {
		repo.deleteById(id);
	}

	public void crea (Prenotazioni prenotazioni  ) {
		List<Prenotazioni> prenota= findByUserAndValidita(prenotazioni.getUtente().getId(), prenotazioni.getValidita());
		List<Prenotazioni> tavolo = findByPostazioneAndDate(prenotazioni.getPostazione().getId(), prenotazioni.getValidita());
		if (prenota == null || prenota.size() == 0 && tavolo.size() < prenotazioni.getPostazione().getNumOccupanti()) {
			repo.save(prenotazioni);
		}
		
		
	}
	public void modifica(Prenotazioni prenotazioni) {
		repo.save(prenotazioni);
		
	}
	public List<Prenotazioni> findByUserAndValidita(Long id, LocalDate validita){
		return  repo.findByUserAndValidita(id, validita);
	};
	
	public List<Prenotazioni> findByPostazioneAndDate(Long id, LocalDate validita){
		return  repo.findByPostazioneAndDate( id,  validita);
	}


}
