package fr.epsi.service;

import java.util.List;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public interface ClientService {

	void create(ClientDTO c);

	List<Client> findAllClients();
}
