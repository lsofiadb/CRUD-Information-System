package backend.agricolas.service;

import backend.agricolas.model.Product;
import backend.agricolas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Product> findProductByCode2(Long code){
        return productRepository.findById(code);
    }

    public List<Product> findAllProducts(){
        List <Product> productList = new ArrayList<>();
        productList = productRepository.findAll();
        return productList;
    }

    public void deleteProductByCode(Long code){
        productRepository.deleteById(code);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> findProductsByCategory(String category){
        return productRepository.findProductByCategory(category);
    }

}
