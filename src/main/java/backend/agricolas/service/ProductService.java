package backend.agricolas.service;

import backend.agricolas.model.Product;
import backend.agricolas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addNewProduct(Product product){
        return productRepository.save(product);
    }

    public Product findProductByCode(Long code){
        return productRepository.findProductByCode(code);
    }
}
