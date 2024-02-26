package OOPs;

public class ChildOne extends Parent {
    long selfWorth;
    int selfCars;
    boolean partner;
    @Override
    void method () {
        System.out.println("I am ChildOne");
    }

    public ChildOne() {
        super();
        this.selfCars = 0;
        this.partner = false;
        this.selfWorth = 0;
    }

    public ChildOne (String title, long netWorth, int cars){
        super(title, netWorth, cars);
        this.selfCars = cars;
        this.partner = false;
        this.selfWorth = netWorth;
    }

    public ChildOne(String title,long netWorth, int cars, long selfWorth) {
        super(title, netWorth, cars);
        this.selfWorth = netWorth + selfWorth;
    }

    public ChildOne(String title,long netWorth, int cars, long selfWorth, int selfCars) {
        super(title, netWorth, cars);
        this.selfWorth = netWorth + selfWorth;
        this.selfCars = cars + selfCars;
    }

    public ChildOne(String title,long netWorth, int cars, long selfWorth, int selfCars, boolean partner) {
        super(title, netWorth, cars);
        this.selfWorth = netWorth + selfWorth;
        this.selfCars = cars + selfCars;
        this.partner = partner;
    }

    // I can define two constructors with different type of
    // arguments but need to make sure it does not create confusion
    // while calling.


//    public ChildOne(String title, int selfCars) {
//        super(title);
//        this.selfCars = selfCars;
//    }

//    public ChildOne(String title, long networth, ){
//        super(title, networth);
//    }

}
