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

    /*
     * 생성자 vs 정적 팩터리 메서드 비교
     * */
    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    private static final Settings SETTINGS = new Settings();

    /*
     * 오로지 정적 팩터리 메서드를 통해 가져갈 수 있음.
     * 매번 팩터리 안에서 새로 만들어 사용할 떄는 newInstance, createInstance 네이밍 사용
     * */
    public static Settings newInstance() {
        return SETTINGS;
    }

    /*
     * 매개변수를 받아서 무언가를 만들 때 of라는 네이밍을 패턴을 사용한다.
     * */
    public static Settings of(boolean useABS) {
        return SETTINGS;
    }

    /*
     * 미리 만들어져 있는 인스턴스를 가져올 때는 getInstance라는 네이밍 패턴을 사용한다.
     * */
    public static Settings getInstance() {
        return SETTINGS;
    }

    // public static void main(String[] args) {
    //     List<String> list = new ArrayList<>();
    //     List.of("dongmin", "eastern");
    // }
}
