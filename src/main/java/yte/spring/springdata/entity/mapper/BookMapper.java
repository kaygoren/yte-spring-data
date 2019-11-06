package yte.spring.springdata.entity.mapper;

import org.mapstruct.Mapper;
import yte.spring.springdata.entity.Book;
import yte.spring.springdata.entity.BookDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

	Book dtoToEntity(BookDTO bookDTO);
	List<Book> dotToEntity(List<BookDTO> bookDTOList);

	BookDTO entityToDto(Book book);
	List<BookDTO> entityToDto(List<Book> bookList);

}
