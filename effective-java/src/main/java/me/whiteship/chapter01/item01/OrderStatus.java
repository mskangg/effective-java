package me.whiteship.chapter01.item01;

public enum OrderStatus {
    // 질문2) enum은 자바의 클래스처럼 생성자, 메소드, 필드를 가질 수 있는가?
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }
}
