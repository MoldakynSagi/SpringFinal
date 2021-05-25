package kz.spring.demo.service;



import kz.spring.demo.entity.Product;
import kz.spring.demo.repository.ProductRepository;
import kz.spring.demo.service.iservice.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findProductByTitle(String name, String title) {
        return productRepository.getProductByTitle(name, title);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public Product createNew(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product updateProductPrice(Long productId, Integer price) {
        Product product = productRepository.getOne(productId);
        product.setPrice(price);
        return productRepository.saveAndFlush(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
