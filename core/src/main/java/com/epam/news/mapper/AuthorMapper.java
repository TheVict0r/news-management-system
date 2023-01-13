package com.epam.news.mapper;

import com.epam.news.dto.AuthorDto;
import com.epam.news.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

	AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

	AuthorDto convertToAuthorDto(Author author);

	Author convertToAuthor(AuthorDto authorDto);

}
