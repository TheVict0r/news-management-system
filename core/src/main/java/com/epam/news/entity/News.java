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
public class News implements Serializable {
	private long id;
	private String title;
	private String content;
	private long authorId;
	private LocalDateTime created;
	private LocalDateTime modified;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		News news = (News) o;

		if (authorId != news.authorId)
			return false;
		if (!title.equals(news.title))
			return false;
		if (!content.equals(news.content))
			return false;
		if (!created.equals(news.created))
			return false;
		return modified.equals(news.modified);
	}

	@Override
	public int hashCode() {
		int result = title.hashCode();
		result = 31 * result + content.hashCode();
		result = 31 * result + (int) (authorId ^ (authorId >>> 32));
		result = 31 * result + created.hashCode();
		result = 31 * result + (modified != null ? modified.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{id=" + id + ", title='" + title + '\'' + ", content='" + content + '\''
				+ ", authorId=" + authorId + ", created=" + created + ", modified=" + modified + '}';
	}

}