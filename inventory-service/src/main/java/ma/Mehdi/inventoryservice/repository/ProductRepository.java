package ma.Mehdi.inventoryservice.repository;

import ma.Mehdi.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
