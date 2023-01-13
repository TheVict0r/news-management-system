package com.epam.news.mapper;

import com.epam.news.dto.CommentDto;
import com.epam.news.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentMapper {

	CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

	CommentDto convertToCommentDto(Comment comment);

	Comment convertToComment(CommentDto commentDto);

}
