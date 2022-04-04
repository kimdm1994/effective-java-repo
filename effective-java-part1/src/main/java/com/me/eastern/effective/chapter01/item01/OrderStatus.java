package com.me.eastern.effective.chapter01.item01;

public enum OrderStatus {

    // PREPARING, SHIPPED, DELIVERING, DELIVERED
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    /*
     * enum에서 생성자 사용법
     * */
    private int number;

    OrderStatus(int number) {
        this.number = number;
    }
}
