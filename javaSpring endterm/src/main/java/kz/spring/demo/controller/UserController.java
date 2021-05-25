package kz.spring.demo.controller;


import kz.spring.demo.entity.Product;
import kz.spring.demo.entity.User;
import kz.spring.demo.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    // GET
    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(iUserService.getAll());
    }

    // POST
    @PostMapping("/create")
    public ResponseEntity<?> createNewUser(@RequestBody User user) {
        return ResponseEntity.ok(iUserService.createNew(user));
    }

    // DELETE
    @DeleteMapping("/{id}/delete/favoriteProduct")
    public ResponseEntity<?> deleteBookFromFavoriteBook(@PathVariable("id") Long id, @RequestBody Product product) {
        return ResponseEntity.ok(iUserService.deleteProductFromFavorites(id, product));
    }

    // PATCH - 2
    @PatchMapping("/{id}/update/username")
    public ResponseEntity<?> updateUserPassword(@PathVariable("id") Long id, @RequestBody String username) {
        return ResponseEntity.ok(iUserService.updateUsername(id, username));
    }

    @PatchMapping("/{id}/update/add-product-to-favorites")
    public ResponseEntity<?> addMusicToFavorites(@PathVariable("id") Long id, @RequestBody Product product) {
        return ResponseEntity.ok(iUserService.addProductToFavorites(id, product));
    }
}
