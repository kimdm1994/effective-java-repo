package com.me.eastern.effective.chapter01.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    /*
     * 어디서든 사용 가능
     * */
    // public static void main(String[] args) {
    //     System.out.println(new Settings()); // com.me.eastern.effective.chapter01.item01.Settings@dfd3711
    //     System.out.println(new Settings()); // com.me.eastern.effective.chapter01.item01.Settings@42d3bd8b
    //     System.out.println(new Settings()); // com.me.eastern.effective.chapter01.item01.Settings@26ba2a48
    // }

    /*
     * private로 생성자를 만들 경우 외부에서 호출 불가
     * */
    private Settings() {
    }

    ;

    private static final Settings SETTINGS = new Settings();

    /*
     * 오로지 정적 팩터리 메서드를 통해 가져갈 수 있음.
     * */
    public static Settings newInstance() {
        return SETTINGS;
    }
}
