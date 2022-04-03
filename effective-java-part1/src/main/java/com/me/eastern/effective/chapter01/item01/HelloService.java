package com.me.eastern.effective.chapter01.item01;

public interface HelloService {

    String hello();

    /*
     * Java 8 이후부터는 interface에 static 선언 가능.
     * interface에 선언하면 기본이 public이기에 생략 가능.
     * */
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
