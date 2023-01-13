package com.epam.news.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.epam.news.dto.AuthorDto;
import com.epam.news.entity.Author;
import org.junit.jupiter.api.Test;

class AuthorMapperTest {

	@Test
	void convertToAuthorDtoShouldReturnAuthorDto() {
		Author author = new Author(1L, "Some name");
		AuthorDto authorDtoExpected = new AuthorDto(1L, "Some name");
		assertEquals(authorDtoExpected, AuthorMapper.INSTANCE.convertToAuthorDto(author));
	}

	@Test
	void convertToAuthorShouldReturnAuthorEntity() {
		AuthorDto authorDto = new AuthorDto(1L, "Some name");
		Author authorExpected = new Author(1L, "Some name");
		assertEquals(authorExpected, AuthorMapper.INSTANCE.convertToAuthor(authorDto));
	}
}