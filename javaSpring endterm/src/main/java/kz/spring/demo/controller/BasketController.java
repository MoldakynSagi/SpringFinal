package kz.spring.demo.controller;

import kz.spring.demo.entity.MyBasket;
import kz.spring.demo.model.StatusE;
import kz.spring.demo.service.iservice.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/baskets")
public class BasketController {
    @Autowired
    private IBasketService iBasketService;

    // GET - 2
    @GetMapping("")
    public ResponseEntity<?> getBasketsByUserId(@RequestParam("userId") Long userId) {
        return ResponseEntity.ok(iBasketService.getBasketsById(userId));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllBaskets() {
        return ResponseEntity.ok(iBasketService.getAll());
    }

    // POST
    @PostMapping("/create")
    public ResponseEntity<?> createNewBasket(@RequestBody MyBasket basket) {
        return ResponseEntity.ok(iBasketService.createNew(basket));
    }

    //PATCH
    @PatchMapping("/{id}/change-basket-status")
    public ResponseEntity<?> changeBasketStatus(@PathVariable("id") Long id, @RequestBody StatusE status) {
        return ResponseEntity.ok(iBasketService.changeBasketStatus(id, status));
    }
}
