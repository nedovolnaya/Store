package skypro.store.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope

public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> items) {
        this.items.addAll(items);
        return items;
    }

    public List<Integer> get() {
        return items;
    }
}
