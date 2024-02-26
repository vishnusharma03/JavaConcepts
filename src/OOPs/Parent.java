package OOPs;

public class Parent {

    protected String title;
    public long netWorth;
    int cars;

    void method () {
        System.out.println("I am ParentOne");
    }
    public Parent() {
        this.cars = 0;
        this.title = "Sharma";
        this.netWorth = 0;
    }

    public Parent(String title) {
        this.title = title;
    }

    public Parent(String title, long netWorth) {
        this.title = title;
        this.netWorth = netWorth;
    }

    public Parent(String title, long netWorth, int cars) {
        this.title = title;
        this.netWorth = netWorth;
        this.cars = cars;
    }

    public Parent(Parent other) {
        this.title = other.title;
        this.cars = other.cars;
        this.netWorth = other.netWorth;
    }
}
