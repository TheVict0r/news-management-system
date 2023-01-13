package com.epam.news.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.epam.news.dto.CommentDto;
import com.epam.news.entity.Comment;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class CommentMapperTest {

	@Test
	void convertToCommentDtoShouldReturnCommentDto() {
		LocalDateTime dateTime = LocalDateTime.now();
		Comment comment = Comment.builder().id(1L).content("Some content").newsId(1L).created(dateTime)
				.modified(dateTime).build();
		CommentDto commentDtoExpected = CommentDto.builder().id(1L).content("Some content").newsId(1L).created(dateTime)
				.modified(dateTime).build();
		assertEquals(commentDtoExpected, CommentMapper.INSTANCE.convertToCommentDto(comment));
	}

	@Test
	void convertToCommentShouldReturnCommentEntity() {
		LocalDateTime dateTime = LocalDateTime.now();
		Comment commentExpected = Comment.builder().id(1L).content("Some content").newsId(1L).created(dateTime)
				.modified(dateTime).build();
		CommentDto commentDto = CommentDto.builder().id(1L).content("Some content").newsId(1L).created(dateTime)
				.modified(dateTime).build();
		assertEquals(commentExpected, CommentMapper.INSTANCE.convertToComment(commentDto));

	}
}