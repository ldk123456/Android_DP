package Chapter10;

public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator("153 + 3589 + 118 + 555");
        System.out.println(c.calculate());
        c = new Calculator("153 + 3589 + 118 - 555 - 597 - 66");
        System.out.println(c.calculate());
    }
}
