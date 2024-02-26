package Abstract;

public abstract class AbstractClass {

    int code;

    public AbstractClass(int code) {
        this.code = code * 53;
    }

    abstract void car();
    abstract void partner();
}
