public class Substring1 {
    public static void main(String[] args) {
        String s = "aabcfadsaga";
        String ans = subStringOne(s);
        System.out.println(ans);
    }

    public static String subStringOne(String s){
        if (s.length()==0)
            return "";

        if (!s.startsWith("a")){
            return s.substring(0,1) + subStringOne(s.substring(1));
        }
        return subStringOne(s.substring(1));
    }
}
