package im.sgg.ka.jd.les06.les06_05_04;

public class Launcher {


    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new IllegalStateException();
        } finally {
            System.out.println("I want to be printed!");
        }
    }
}
