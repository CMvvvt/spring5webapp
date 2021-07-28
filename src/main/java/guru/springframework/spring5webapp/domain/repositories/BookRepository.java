package guru.springframework.spring5webapp.domain.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/7/28 18:14
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}