import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Leetcode17 {
    static HashMap<Character, List<String>> map = new HashMap<>();

    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    private static List<String> letterCombinations(String digits) {
        for (char i = '2'; i <= '9'; i++) {
            map.put(i, new ArrayList<>());
        }
        map.get('2').add("a");
        map.get('2').add("b");
        map.get('2').add("c");
        map.get('3').add("d");
        map.get('3').add("e");
        map.get('3').add("f");
        map.get('4').add("g");
        map.get('4').add("h");
        map.get('4').add("i");
        map.get('5').add("j");
        map.get('5').add("k");
        map.get('5').add("l");
        map.get('6').add("m");
        map.get('6').add("n");
        map.get('6').add("o");
        map.get('7').add("p");
        map.get('7').add("q");
        map.get('7').add("r");
        map.get('7').add("s");
        map.get('8').add("t");
        map.get('8').add("u");
        map.get('8').add("v");
        map.get('9').add("w");
        map.get('9').add("x");
        map.get('9').add("y");
        map.get('9').add("z");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            list.add(new ArrayList<>());
            Object[] x = map.get(digits.charAt(i)).toArray();
//            System.out.println(Arrays.toString(x));
            for (int j = 0; j < x.length; j++) {
                list.get(i).add((String) x[j]);
            }
        }
        return helper(list);
    }

    private static List<String> helper(ArrayList<ArrayList<String>> list) {



        return new ArrayList<>();
    }
}


//        List<String> left = helper(p+up.charAt(0), up.substring(1));
////        List<String> right = helper();
//        return new ArrayList<>();
//    }
//}
//    public static List<String> letterCombinations(String digits) {
//        HashMap <Character, List<String>> map = new HashMap<>();
//        for (char i = '2'; i <= '9'; i++) {
//            map.put(i, new ArrayList<>());
//        }
//        map.get('2').add("a");
//        map.get('2').add("b");
//        map.get('2').add("c");
//        map.get('3').add("d");
//        map.get('3').add("e");
//        map.get('3').add("f");
//        map.get('4').add("g");
//        map.get('4').add("h");
//        map.get('4').add("i");
//        map.get('5').add("j");
//        map.get('5').add("k");
//        map.get('5').add("l");
//        map.get('6').add("m");
//        map.get('6').add("n");
//        map.get('6').add("o");
//        map.get('7').add("p");
//        map.get('7').add("q");
//        map.get('7').add("r");
//        map.get('7').add("s");
//        map.get('8').add("t");
//        map.get('8').add("u");
//        map.get('8').add("v");
//        map.get('9').add("w");
//        map.get('9').add("x");
//        map.get('9').add("y");
//        map.get('9').add("z");
//
//        List<String> result = new ArrayList<>();
//
//        String[] ans = new String[16];
//        ans = map.get(digits.charAt(0)).toArray(new String[0]);
//        for (int i = 0; i < digits.length(); i++) {
////            String[] a = map.get(digits.charAt(i)).toArray(new String[0]);
//            String[] b = map.get(digits.charAt(i+1)).toArray(new String[0]);
//            ans = muiltiply(ans, b);
////            System.out.println(Arrays.toString(a));
//
//        }
//        System.out.println(Arrays.toString(ans));
//    return new ArrayList<>();
//    }
//
//    private static String[] muiltiply(String[] a, String[] b) {
//        String[] list = new String[a.length*b.length];
//        int k = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                list[k] = a[i] + b[j];
//                k++;
//            }
//        }
//        return list;
//    }
//}
