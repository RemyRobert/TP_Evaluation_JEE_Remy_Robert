package fr.epsi.entite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFacture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "idfacture")
	private Facture idfacture;

	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article idarticle;

	private int qte;
	private Double prix;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Facture getIdfacture() {
		return idfacture;
	}

	public void setIdfacture(Facture idfacture) {
		this.idfacture = idfacture;
	}

	public Article getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Article idarticle) {
		this.idarticle = idarticle;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
