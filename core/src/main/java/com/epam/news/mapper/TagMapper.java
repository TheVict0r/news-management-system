package com.epam.news.mapper;

import com.epam.news.dto.TagDto;
import com.epam.news.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TagMapper {

	TagMapper INSTANCE = Mappers.getMapper(TagMapper.class);
	TagDto convertToTagDto(Tag tag);
	Tag convertToTag(TagDto tagDto);

}
