package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/7/28 23:10
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
