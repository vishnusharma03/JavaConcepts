import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        String s = "abca";
        List<List<String>> ans = subSequenceTwo(s);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static List<String> subSequence(String sOne, String sTwo) {

        if (sTwo.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(sOne);
            return list;
        }
        List<String> left = subSequence(sOne + sTwo.charAt(0), sTwo.substring(1));
        List<String> right = subSequence(sOne, sTwo.substring(1));
        left.addAll(right);
        return left;
    }

    // Extracting all possible subsets of a string via iteration
    public static List<List<String>> subSequenceTwo(String sOne) {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for (int i = 0; i < sOne.length(); i++) {
            int size = list.size();
            for (int j = 0; j < size; j++){
                List<String> inner = new ArrayList<>(list.get(j));
                inner.add(String.valueOf(sOne.charAt(i)));
                list.add(inner);
            }
        }
        return list;
    }

    // Extracting all possible subsets of a string via iteration for duplicates elements
    public static List<List<String>> subSequenceThree(String sOne) {
        char[] arr = sOne.toCharArray();
        Arrays.sort(arr);
        String sTwo = new String(arr);
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for (int i = 0; i < sTwo.length(); i++) {
            int size = list.size();
            for (int j = 0; j < size; j++){
                if (i-1 > -1 && !list.get(i-1).toString().equals(String.valueOf(sTwo.charAt(i)))) {
                    List<String> inner = new ArrayList<>(list.get(j));
                    inner.add(String.valueOf(sTwo.charAt(i)));
                    list.add(inner);
                }
            }
        }
        return list;
    }
}
