import java.util.List;
import java.util.Vector;

public class KKV43 {

    enum X {
        SpaceX, Neuralink, BoringCompany, TeslaMotors, SolarCity;

        X() {
            System.out.println("Constructor call for " + this);
        }
    }
    public static void main(String[] args) {
        List<Integer> sv = new Vector<>();

        sv.add(4);
        System.out.println(sv);


        X a;
        a = X.Neuralink;

        System.out.println(a.ordinal());

    }
}
