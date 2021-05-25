package kz.spring.demo.repository;

import kz.spring.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductById(Long id);
    List<Product> getProductByTitle(String name, String title);
}
