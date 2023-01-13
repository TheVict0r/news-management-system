package com.epam.news.mapper;

import com.epam.news.dto.NewsDto;
import com.epam.news.entity.News;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class NewsMapperTest {

    @Test
    void convertToNewsDtoShouldReturnNewsDto() {
        LocalDateTime dateTime = LocalDateTime.now();
        News news = News.builder().id(1L).title("Some Title").content("Some content").authorId(1L).created(dateTime).modified(dateTime).build();
        NewsDto newsDtoExpected = NewsDto.builder().id(1L).title("Some Title").content("Some content").authorId(1L).created(dateTime).modified(dateTime).build();
        assertEquals(newsDtoExpected, NewsMapper.INSTANCE.convertToNewsDto(news));
    }

    @Test
    void convertToNewsShouldReturnNewsEntity() {
        LocalDateTime dateTime = LocalDateTime.now();
        News newsExpected = News.builder().id(1L).title("Some Title").content("Some content").authorId(1L).created(dateTime).modified(dateTime).build();
        NewsDto newsDto = NewsDto.builder().id(1L).title("Some Title").content("Some content").authorId(1L).created(dateTime).modified(dateTime).build();
        assertEquals(newsExpected, NewsMapper.INSTANCE.convertToNews(newsDto));
    }
}