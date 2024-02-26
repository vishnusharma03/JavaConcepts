package OOPs2;

import OOPs.Parent;

public class NazayazClass extends Parent {
    String residence;
    int kids;

    public NazayazClass(){
        super();
        this.residence = "UnknownCountry";
        this.kids = 0;
    }
    public NazayazClass(String residence, int kids) {
        this.residence = residence;
        this.kids = kids;
    }

    public NazayazClass(String title, String residence, int kids) {
        super(title);
        this.residence = residence;
        this.kids = kids;
    }

    public NazayazClass(String title, long netWorth, String residence, int kids) {
        super(title, netWorth);
        this.residence = residence;
        this.kids = kids;
    }

    public NazayazClass(String title, long netWorth, int cars, String residence, int kids) {
        super(title, netWorth, cars);
        this.residence = residence;
        this.kids = kids;
    }

    public NazayazClass(Parent other, String residence, int kids) {
        super(other);
        this.residence = residence;
        this.kids = kids;
    }

    public static void main(String[] args) {

        // This is a subclass of Parent Class in different Package.
        // Hence, it is working here.
        NazayazClass sv3 = new NazayazClass();
        String title = sv3.title;

        // If you create a Parent reference type here, it should
        // not work, Why this is the case?

        // That's the functionality of the protected, I guess!

        // Giving Error
//        Parent sv4 = new NazayazClass();
//        sv4.title;
    }
}
