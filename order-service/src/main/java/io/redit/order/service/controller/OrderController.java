package io.redit.order.service.controller;

import io.redit.base.domains.dto.Order;
import io.redit.base.domains.dto.OrderEvent;
import io.redit.order.service.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order) {
        order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setMessage("Order Status is PENDING");
        orderEvent.setStatus("PENDING");
        orderEvent.setOrder(order);
        orderProducer.sendOrderEvent(orderEvent);

        return "Order Placed Successfully";

    }
}
