package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.service.FactureService;

public class ListFactureServlet extends HttpServlet {

	@EJB
	private FactureService service;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException

	{
		List<Facture> factures = service.findAllFactures();
		req.setAttribute("factures", factures);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listFacture.jsp").forward(req, resp);
	}

}
