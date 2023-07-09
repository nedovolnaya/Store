package skypro.store.service;

import org.springframework.stereotype.Service;
import skypro.store.model.Cart;

import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return cart.add(items);
    }

    @Override
    public List<Integer> getItems() {
        return cart.get();
    }
}
