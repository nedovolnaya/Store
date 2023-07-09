package skypro.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.store.service.OrderService;

import java.util.List;

@RestController

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    private List<Integer> addItems(@RequestParam List<Integer> items) {
        return orderService.addItems(items);
    }

    @GetMapping("/get")
    private List<Integer> getItems() {
        return orderService.getItems();
    }
}
