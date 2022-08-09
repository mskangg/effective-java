package me.whiteship.chapter01.item01;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order createForPrime(boolean prime, Product product) {
        Order order = new Order();
        order.prime = prime;
        order.product = product;
        return order;
    }

    public static Order createForUrgent(boolean urgent, Product product) {
        Order order = new Order();
        order.urgent = urgent;
        order.product = product;
        return order;
    }

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        // 질문1) 특정 enum 타입이 가질 수 있는 모든 값을 순회하며 출력하라.
        Arrays.stream(OrderStatus.values())
                .forEach(orderStatus1 -> System.out.println("orderStatus1 = " + orderStatus1));

        // 질문3) enum의 값은 == 연산자로 동일성을 비교할 수 있는가?
        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("order = " + order);
        }

        // 과제) enum을 key로 사용하는 Map을 정의하세요.
        EnumMap<OrderStatus, String> enumMap = new EnumMap(OrderStatus.class);
        enumMap.put(OrderStatus.PREPARING, "PRE");
        enumMap.put(OrderStatus.DELIVERING, "DEL");
        enumMap.put(OrderStatus.SHIPPED, "SHIPP");
        enumMap.put(OrderStatus.DELIVERED, "DELIVERED");
        for (Map.Entry<OrderStatus, String> orderStatusStringEntry : enumMap.entrySet()) {
            System.out.println("orderStatusStringEntry.getKey() = " + orderStatusStringEntry.getKey());
            System.out.println("orderStatusStringEntry.getValue() = " + orderStatusStringEntry.getValue());
        }

        // 또는 enum을 담고 있는 Set을 만들어 보세요.
        EnumSet<OrderStatus> allOfOrderStatuses = EnumSet.allOf(OrderStatus.class);
        System.out.println("allOfOrderStatuses = " + allOfOrderStatuses);
        EnumSet<OrderStatus> noneOfOrderStatuses = EnumSet.noneOf(OrderStatus.class);
        System.out.println("noneOfOrderStatuses = " + noneOfOrderStatuses);
        EnumSet<OrderStatus> ofOrderStatuses = EnumSet.of(OrderStatus.SHIPPED, OrderStatus.PREPARING);
        System.out.println("ofOrderStatuses = " + ofOrderStatuses);
    }
}
