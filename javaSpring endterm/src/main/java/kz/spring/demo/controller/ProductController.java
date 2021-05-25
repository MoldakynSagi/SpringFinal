package kz.spring.demo.controller;

import kz.spring.demo.entity.Product;
import kz.spring.demo.service.iservice.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    // GET - 3
    @GetMapping("")
    public ResponseEntity<?> findProductByTitle(@RequestParam("name") String name, @RequestParam("title") String title) {
        return ResponseEntity.ok(iProductService.findProductByTitle(name, title));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable() Long id) {
        return ResponseEntity.ok(iProductService.getProductById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(iProductService.getAll());
    }

    // POST
    @PostMapping("/action/create")
    public ResponseEntity<?> createNewProduct(@RequestBody Product product) {
        return ResponseEntity.ok(iProductService.createNew(product));
    }

    // PUT
    @PutMapping("/action/update")
    public ResponseEntity<?> updateProduct(@RequestBody Product product) {
        return ResponseEntity.ok(iProductService.update(product));
    }

    // DELETE
    @DeleteMapping("/action/delete/{id}")
    public void deleteProductById(@PathVariable("id") Long id) {
        iProductService.deleteProductById(id);
    }

    // PATCH
    @PatchMapping("/action/update/{id}")
    public ResponseEntity<?> updateProductPrice(@PathVariable("id") Long id, @RequestParam("price") Integer price) {
        return ResponseEntity.ok(iProductService.updateProductPrice(id, price));
    }
}
