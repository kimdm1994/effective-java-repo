package com.me.eastern.effective.chapter01.item01;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    /*
     * enum 사용 시 오로지 하나만 만들어 지며, 필요 값 이외에 사용 X
     * */
    private OrderStatus orderStatus;
    // private OrderStatus orderStatus = OrderStatus.DELIVERED;
    /*
     * 0 - 주문 받음
     * 1 - 준비중
     * 2 - 배송 중
     * 3 - 배송 완료
     * */
    // private int status = 200;
    // private final int PREPARING = 0;
    // private final int SHIPPED = 2;

    // public Order(Product product, boolean prime) {
    //     this.product = product;
    //     this.prime = prime;
    // }

    // 1. 가능은 하지만 사용하면 안됨
    // public Order(boolean urgent, Product product) {
    //     this.product = product;
    //     this.urgent = urgent;
    // }

    /*
     * 첫번째 장점 : 중복되는 시그니처를 정적 팩터리를 활용할 수 있다.
     * */
    // 정적 팩터리 메서드를 이용하자!(인스턴스를 만들어주어 리턴)
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
        /*
         * values는 enum 타입의 모든 value들을 갖고 있다.
         * */
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        Order order = new Order();
        // if (order.orderStatus.equals(OrderStatus.DELIVERED)) {
        //     // java.lang.NullPointerException
        //     System.out.println("delivered");
        // }
        if (order.orderStatus == OrderStatus.DELIVERED) {
            // equals가 아닌 "=="를 사용하자! NullPointerException 방지
            System.out.println("delivered");
        }
    }
}
