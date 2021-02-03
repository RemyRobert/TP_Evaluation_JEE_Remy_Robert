package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	EntityManager em;

	@Resource
	UserTransaction utx;

	public void create(ArticleDTO a) {

		Article article = new Article();
		article.setNom(a.getNom());
		article.setPrix(a.getPrix());
		ArticleDao dao = new ArticleDaoImpl(em, utx);

		dao.create(article);

	}

	public List<Article> findAllArticles() {
		List<Article> listeArticles = em.createQuery("SELECT a from Article a order by a.nom", Article.class)
				.getResultList();
		return listeArticles;
	}

	public Article findArticleById(Integer id) {
		List<Article> list = findAllArticles();
		for (Article a : list) {
			if (a.getId().equals(id)) {
				return a;
			}
		}

		return null;
	}

}
