package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public interface ArticleService {
	
	void create(ArticleDTO a);
	
	List<Article> findAllArticles();
	
	Article findArticleById(Integer id);
}
