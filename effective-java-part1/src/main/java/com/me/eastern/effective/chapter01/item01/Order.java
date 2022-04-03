package com.me.eastern.effective.chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

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
}
