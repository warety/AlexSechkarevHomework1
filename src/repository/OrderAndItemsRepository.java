package repository;

import model.OrderAndItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 03.05.2018.
 */
@Repository
public interface OrderAndItemsRepository extends CrudRepository<OrderAndItems, Long> {
}
