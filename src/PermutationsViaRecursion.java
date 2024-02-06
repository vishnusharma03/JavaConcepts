import java.util.ArrayList;
import java.util.List;

public class PermutationsViaRecursion {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        List<String> ans = permutations2(p,up);
        System.out.println(ans);
    }

    // Without passing the array in argument.
    public static List<String> permutations2(String p, String up) {
        List<String> ans = new ArrayList<>();

        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        char sOne = up.charAt(0);
        up = up.substring(1);
        for (int i = 0; i < p.length()+1; i++) {
            String sTwo = p.substring(0, i) +
                    sOne +
                    p.substring(i);
            ans.addAll(permutations2(sTwo, up));

        }
        return ans;
    }

    // While passing the array in argument.
    public static List<String> permutations(String p, String up, List<String> ans) {

        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        char sOne = up.charAt(0);
        up = up.substring(1);
        for (int i = 0; i < p.length()+1; i++) {
            StringBuilder sTwo = new StringBuilder();
            sTwo.append(p.substring(0,i));
            sTwo.append(sOne);
            sTwo.append(p.substring(i));
            permutations(sTwo.toString(), up, ans);

        }
        return ans;
    }
}
