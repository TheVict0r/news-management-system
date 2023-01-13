package com.epam.news.entity;

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
public class Comment implements Serializable {

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

		Comment comment = (Comment) o;

		if (newsId != comment.newsId)
			return false;
		if (!content.equals(comment.content))
			return false;
		if (!created.equals(comment.created))
			return false;
		return modified.equals(comment.modified);
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
