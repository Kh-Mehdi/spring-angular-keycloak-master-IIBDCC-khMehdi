package ma.Mehdi.orderservice.repsoitories;


import ma.Mehdi.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
