package kz.spring.demo.event;


import kz.spring.demo.entity.MyBasket;
import kz.spring.demo.model.StatusE;
import org.springframework.context.ApplicationEvent;

public class ChangeBasketStatus extends ApplicationEvent {
    private StatusE statusE;
    private MyBasket myBasket;

    public ChangeBasketStatus(Object source, StatusE statusE, MyBasket myBasket) {
        super(source);
        this.statusE = statusE;
        this.myBasket = myBasket;
    }

    public StatusE getOldStatus() {
        return statusE;
    }

    public MyBasket getMyOrder() {
        return myBasket;
    }
}
