package com.sbs.example.lolPrac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.example.lolPrac.dao.ArticleDao;
import com.sbs.example.lolPrac.dto.Article;

@Service
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

}
