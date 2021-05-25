package kz.spring.demo.event;


import kz.spring.demo.entity.Product;
import kz.spring.demo.entity.User;
import org.springframework.context.ApplicationEvent;

public class UserAddNewFavorite extends ApplicationEvent {
    private User user;
    private Product product;

    public UserAddNewFavorite(Object source, User user, Product product) {
        super(source);
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
