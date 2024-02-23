import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class maze101 {
    public static void main(String[] args) {

        ArrayList<String> list = mazeDiagonal("", 3, 3);
        System.out.println(list);

    }

    private static void maze(String sOne, int r, int c) {
        if (r==1 && c==1){
            System.out.println(sOne);
            return;
        }

        if (r > 1)
            maze(sOne+'D', r-1, c);
        if (c > 1)
            maze(sOne+'R', r, c-1);
    }

    private static ArrayList<String> mazeDiagonal(String sOne, int r, int c) {
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(sOne);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        if (r > 1)
            result.addAll(mazeDiagonal(sOne+'D', r-1, c));
        if (c > 1)
            result.addAll(mazeDiagonal(sOne+'R', r, c-1));
        if (r>1 & c>1)
           result.addAll(mazeDiagonal(sOne+"DR", r-1, c-1));

        return result;
    }
}
