package com.epam.news.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.epam.news.dto.TagDto;
import com.epam.news.entity.Tag;
import org.junit.jupiter.api.Test;

class TagMapperTest {

	@Test
	void convertToTagDtoShouldReturnTagDto() {
		Tag tag = new Tag(1L, "Some name");
		TagDto tagDtoExpected = new TagDto(1L, "Some name");
		assertEquals(tagDtoExpected, TagMapper.INSTANCE.convertToTagDto(tag));
	}

	@Test
	void convertToTagShouldReturnTagEntity() {
		TagDto tagDto = new TagDto(1L, "Some name");
		Tag tagExpected = new Tag(1L, "Some name");
		assertEquals(tagExpected, TagMapper.INSTANCE.convertToTag(tagDto));

	}
}