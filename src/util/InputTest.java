package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Please follow the instructions");

        Input input = new Input();

        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
        System.out.println(input.getDouble(10,20));
    }
}
