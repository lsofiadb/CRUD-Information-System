package backend.agricolas.controller;

import backend.agricolas.model.Product;
import backend.agricolas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productController")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addNewProduct")
    public Product addNewProduct(@RequestBody Product product){
        return productService.addNewProduct(product);
    }

    @GetMapping("/findProductByCode/{code}")
    public Product findProductByCode(@PathVariable Long code){
        return productService.findProductByCode(code);
    }

    @GetMapping("/findProductByCode2/{code}")
    public Optional<Product> findProductByCode2(@PathVariable Long code){
        return productService.findProductByCode2(code);
    }
    @DeleteMapping("/deleteProductByCode/{code}")
    public void deleteProductByCode(@PathVariable Long code){
        productService.deleteProductByCode(code);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @GetMapping("/findAllProducts")
    public List<Product> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/findProductsByCategory/{category}")
    public List<Product> findProductsByCategory(@PathVariable String category){
        return productService.findProductsByCategory(category);
    }

}
