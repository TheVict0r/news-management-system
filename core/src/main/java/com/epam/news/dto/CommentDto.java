package com.epam.news.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CommentDto implements Serializable {

	private long id;
	private String content;
	private long newsId;
	private LocalDateTime created;
	private LocalDateTime modified;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		CommentDto commentDto = (CommentDto) o;

		if (newsId != commentDto.newsId)
			return false;
		if (!content.equals(commentDto.content))
			return false;
		if (!created.equals(commentDto.created))
			return false;
		return modified.equals(commentDto.modified);
	}

	@Override
	public int hashCode() {
		int result = content.hashCode();
		result = 31 * result + (int) (newsId ^ (newsId >>> 32));
		result = 31 * result + created.hashCode();
		result = 31 * result + modified.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{id=" + id + ", content='" + content + '\'' + ", newsId=" + newsId
				+ ", created=" + created + ", modified=" + modified + '}';
	}
}
