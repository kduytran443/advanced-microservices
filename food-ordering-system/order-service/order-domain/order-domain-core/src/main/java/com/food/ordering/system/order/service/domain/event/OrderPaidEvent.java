package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.event.DomainEvent;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends DomainEvent<Order> {
    public OrderPaidEvent(Order data, ZonedDateTime zonedDateTime) {
        super(data, zonedDateTime);
    }
}
