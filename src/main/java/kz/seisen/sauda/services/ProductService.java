package kz.seisen.sauda.services;


import kz.seisen.sauda.models.Product;
import kz.seisen.sauda.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public List<Product> listProducts(String title) {
        if (title == null || title.isEmpty()) {
            return productRepository.findAll();
        } else {
            return productRepository.findByTitle(title);
        }
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

}
