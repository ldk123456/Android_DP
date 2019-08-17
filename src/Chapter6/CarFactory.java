package Chapter6;

public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();

}
