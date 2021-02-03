package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;
import fr.epsi.service.LigneFactureService;

public class FactureDetailServlet extends HttpServlet {

	@EJB
	FactureService service;

	@EJB
	LigneFactureService ligneFactureService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer selectedFactureId = Integer.parseInt(req.getParameter("id"));

		System.out.println("id : " + selectedFactureId);
		Facture f = service.findFactureById(selectedFactureId);

		List<LigneFacture> l = ligneFactureService.findAllLigneFactures(f);

		double total = 0;
		for (LigneFacture lf : l) {
			total += +lf.getPrix() * lf.getQte();
		}

		req.setAttribute("facture", f);
		req.setAttribute("lignefactures", l);
		req.setAttribute("total", total);

		this.getServletContext().getRequestDispatcher("/WEB-INF/factureDetails.jsp").forward(req, resp);
	}

}
