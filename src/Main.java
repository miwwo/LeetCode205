import java.util.HashMap;
import java.util.Objects;

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!alphabet.containsKey(s.charAt(i)))
                if (!alphabet.containsValue(t.charAt(i))) alphabet.put(s.charAt(i),t.charAt(i));
                else return false;
            else {
                if (alphabet.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String s1 = "badc";
        String t1 = "baba";
        //false
        System.out.println(Solution.isIsomorphic(s1,t1));

        String s2 = "paper";
        String t2 = "title";
        //true
        System.out.println(Solution.isIsomorphic(s2,t2));
    }
}