package HashMap;

public class KarpRabin {
    private final int PRIME = 405;

    private double calculateHash(String sone){
        double hash = 0;
        for (int i = 0; i < sone.length(); i++) {
            hash += sone.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private double updateHash(double prevHash, char prevChar, char nextChar, int patternLen){
        double tempHash = (prevHash - prevChar) / PRIME;
        tempHash = tempHash + nextChar * Math.pow(PRIME, patternLen-1);
        return tempHash;
    }

    public void search(String text, String substring){
        double substringHash = calculateHash(substring);
        double rollingHash = calculateHash(text.substring(0, substring.length()));

        for (int i = 0; i < text.length() - substring.length()+1; i++) {

            if (rollingHash==substringHash){
                String substring1 = text.substring(i, i + substring.length());
                if (substring.equals(substring1)){
                    System.out.println("Found at index " + i);
                }
            }
            if (i < text.length()-substring.length()){
                    rollingHash = updateHash(rollingHash, text.charAt(i), text.charAt(i+substring.length()), substring.length());
            }
        }
    }
}
