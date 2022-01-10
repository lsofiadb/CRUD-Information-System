package backend.agricolas.repository;

import backend.agricolas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findProductByCode(Long code);
    public List<Product> findProductByCategory(String category);
    public void deleteProductByCode(Long code);

}
