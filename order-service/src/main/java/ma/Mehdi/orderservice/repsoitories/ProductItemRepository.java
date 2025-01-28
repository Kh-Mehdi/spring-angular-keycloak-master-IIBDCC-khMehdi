package ma.Mehdi.orderservice.repsoitories;

import ma.Mehdi.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
