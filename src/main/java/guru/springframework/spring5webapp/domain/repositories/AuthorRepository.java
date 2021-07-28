package guru.springframework.spring5webapp.domain.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/7/28 18:13
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
