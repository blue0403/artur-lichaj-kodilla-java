package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderedProducts(), orderRequest.getOrderTime());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getOrderedProducts(), orderRequest.getOrderTime());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderedProducts(), orderRequest.getOrderTime());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
