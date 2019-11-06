package yte.spring.springdata.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import yte.spring.springdata.entity.Book;

import java.time.LocalDateTime;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book>, QuerydslPredicateExecutor<Book> {

	List<Book> findByTitle(String title);

	List<Book> findByAgeGreaterThanEqual(Long age, Sort sort);

	List<Book> findByPublishDateAfter(LocalDateTime publishDate, Pageable pageable);

	List<Book> findByTitleContains(String title);

	List<Book> findByAuthorAndAgeGreaterThanEqual(String author, Long age);

	int countByAuthor(String author);

	boolean existsByAuthor(String author);
}
