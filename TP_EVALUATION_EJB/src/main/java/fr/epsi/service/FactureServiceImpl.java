package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {

	@PersistenceContext
	EntityManager em;

	@Resource
	UserTransaction utx;

	public List<Facture> findAllFactures() {
		List<Facture> listeFactures = em.createQuery("SELECT f from Facture f order by f.numero", Facture.class)
				.getResultList();
		return listeFactures;
	}

	public Facture findFactureById(Integer id) {
		List<Facture> list = findAllFactures();
		for (Facture f : list) {
			if (f.getId().equals(id)) {
				return f;
			}
		}

		return null;
	}

}
