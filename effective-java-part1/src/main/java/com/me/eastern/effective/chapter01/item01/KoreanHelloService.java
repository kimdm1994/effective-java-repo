package com.me.eastern.effective.chapter01.item01;

import java.sql.SQLOutput;

public class KoreanHelloService implements HelloService {

    @Override
    public String hello() {
        return "안녕하세요.";
    }
}
