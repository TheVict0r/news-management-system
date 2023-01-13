package com.epam.news.controller;

import com.epam.news.entity.News;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/news")
public class NewsController {

	private News news = News.builder().id(1L).title("Some Title").content("Some content").authorId(1L)
			.created(LocalDateTime.now()).modified(LocalDateTime.now()).build();

	@GetMapping(path = "/{id}")
	public News getById(@PathVariable("id") Long id) {
		log.info("Providing news article by ID ({})", id);
		return news;
	}

	@GetMapping
	public News getAllNews() {
		log.info("Providing all news articles ");
		return news;
	}

}
