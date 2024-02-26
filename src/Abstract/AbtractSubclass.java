package Abstract;

public class AbtractSubclass extends AbstractClass{
    public AbtractSubclass(int code) {
        super(code);
    }

    @Override
    void car() {
        System.out.println("Bugatti");
    }

    @Override
    void partner() {
        System.out.println("N/A");
    }
}
