package yte.spring.springdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private Long age;
	private LocalDateTime publishDate;
}
