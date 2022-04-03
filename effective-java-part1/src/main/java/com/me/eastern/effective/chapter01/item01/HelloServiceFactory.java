package com.me.eastern.effective.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {
    /*
     * Java 8 이전에는 인터페이스를 Static에 사용 불가능했음.
     * */
    // public static HelloService of(String lang) {
    //     if (lang.equals("ko")) {
    //         return new KoreanHelloService();
    //     } else {
    //         return new EnglishHelloService();
    //     }
    // }
    // public static void main(String[] args) {
    //     HelloService ko = HelloServiceFactory.of("ko");
    // }

    // public static void main(String[] args) {
    //     HelloService eng = HelloService.of("eng");
    //     System.out.println(eng.hello());
    // }

    public static void main(String[] args) {
        // 모든 HelloService의 구현체를 가져온다.
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        
        /*
        * ChineseHelloServiece에 의존하지 않음
        * */
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.hello());
        });
        
        /*
        * ChineseHelloServiece에 의존적
        * import를 해야함
        * */
        // HelloService helloService = new ChineseHelloServiece();
        // System.out.println(helloService.hello());
    }
}
