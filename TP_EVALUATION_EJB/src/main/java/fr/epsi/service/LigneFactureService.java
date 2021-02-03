package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public interface LigneFactureService {
	
	
	List<LigneFacture> findAllLigneFactures(Facture facture);
	

}
