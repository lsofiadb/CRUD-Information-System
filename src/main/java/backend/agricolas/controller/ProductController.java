package backend.agricolas.controller;

import backend.agricolas.model.Product;
import backend.agricolas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productController")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addNewProduct")
    public Product addNewProduct(@RequestBody Product product){
        return productService.addNewProduct(product);
    }
}
