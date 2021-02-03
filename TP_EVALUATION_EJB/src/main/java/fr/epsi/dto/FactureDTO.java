package fr.epsi.dto;

import java.util.Date;

import fr.epsi.entite.Client;

public class FactureDTO {

	private Client idclient;
	private Date dateFacture;
	private String numero;
	private Double prix;
	

	public Client getIdclient() {
		return idclient;
	}
	public void setIdclient(Client idClient) {
		this.idclient = idClient;
	}
	public Date getDate() {
		return dateFacture;
	}
	public void setDate(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	

}
