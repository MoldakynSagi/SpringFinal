package kz.spring.demo.service.iservice;




import kz.spring.demo.entity.Product;
import kz.spring.demo.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    User createNew(User user);
    User updateUsername(Long id, String username);
    User addProductToFavorites(Long userId, Product product);
    User deleteProductFromFavorites(Long userId, Product product);
}
