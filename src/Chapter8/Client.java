package Chapter8;

public class Client {
    public static void main(String[] args) {
        TvController controller = new TvController();
        controller.powerOn();
        controller.powerOn();
        controller.nextChannel();
        controller.turnUp();
        controller.powerOff();
        controller.turnUp();
        controller.powerOff();
    }
}
