package kz.spring.demo.service.iservice;



import kz.spring.demo.entity.MyBasket;
import kz.spring.demo.model.StatusE;

import java.util.List;

public interface IBasketService {
    List<MyBasket> getAll();
    List<MyBasket> getBasketsById(Long userId);
    MyBasket createNew(MyBasket myBasket);
    MyBasket changeBasketStatus(Long basketId, StatusE status);
}
