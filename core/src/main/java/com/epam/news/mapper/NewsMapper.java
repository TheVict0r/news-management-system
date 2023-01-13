package com.epam.news.mapper;

import com.epam.news.dto.NewsDto;
import com.epam.news.entity.News;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    NewsDto convertToNewsDto(News news);

    News convertToNews(NewsDto newsDto);

}
