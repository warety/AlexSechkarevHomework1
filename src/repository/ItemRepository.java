package repository;

import model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 03.05.2018.
 */

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
