package yte.spring.springdata.entity.specification;

import org.springframework.data.jpa.domain.Specification;
import yte.spring.springdata.entity.Book;

import java.time.LocalDateTime;

public class BookSpecification {

	public static Specification<Book> title(String title){
		return (root, query, criteriaBuilder) ->
				criteriaBuilder.equal(root.get("title"), title);
	}

	public static Specification<Book> publishedLaterThan(LocalDateTime publishDate) {
		return (Specification<Book>) (root, query, criteriaBuilder) ->
				criteriaBuilder.greaterThan(root.get("publishDate"), publishDate);
	}

	public static Specification<Book> titleConstains(String title) {
		return (root, query, criteriaBuilder) ->
				criteriaBuilder.like(root.get("title"), "%" + title + "%");
	}

	public static Specification<Book> authorEquals(String author) {
		return (root, query, criteriaBuilder) ->
				criteriaBuilder.equal(root.get("author"),author);
	}

	public static Specification<Book> ageGreaterThan(Long age) {
		return (Specification<Book>) (root, query, criteriaBuilder) ->
				criteriaBuilder.gt(root.get("age"),age);
	}
	public static Specification<Book> authorEqulasAndAgeGreaterThan(String author, Long age) {
		return authorEquals(author).and(ageGreaterThan(age));
	}
}
