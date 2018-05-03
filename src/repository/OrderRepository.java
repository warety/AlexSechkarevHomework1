package repository;

import model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 03.05.2018.
 */

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
