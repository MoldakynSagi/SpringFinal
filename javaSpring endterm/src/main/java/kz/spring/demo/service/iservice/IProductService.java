package kz.spring.demo.service.iservice;


import kz.spring.demo.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    List<Product> findProductByTitle(String name, String title);
    Product getProductById(Long id);
    Product createNew(Product product);
    Product update(Product product);
    Product updateProductPrice(Long productId, Integer price);
    void deleteProductById(Long id);
}
