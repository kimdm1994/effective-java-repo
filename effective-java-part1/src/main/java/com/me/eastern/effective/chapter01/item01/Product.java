package com.me.eastern.effective.chapter01.item01;

public class Product {

    public static void main(String[] args) {
        /*
         * 'Settings()' 이(가) 'com.me.eastern.effective.chapter01.item01.Settings'에서 private 액세스를 가집니다.
         * */
        // Settings settings = new Settings();

        /*
        * 정적 팩토리 메서드 호출!!
        * 인스턴스를 가져올 수 있지만, 생성은 불가능!!
        * */ 
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1);
        System.out.println(settings2);

        // @HotSpotIntrinsicCandidate
        // public static Boolean valueOf(boolean b) {
        //     return (b ? TRUE : FALSE);
        // }
        Boolean.valueOf(false);
    }
}
