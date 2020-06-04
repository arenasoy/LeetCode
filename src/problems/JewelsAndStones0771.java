package problems;

import java.util.*;

public class JewelsAndStones0771 {
    
    //O(N) time, O(N) space
    public int numJewelsInStones(String J, String S) {
        
        int result = 0;
        Set<Character> set = new HashSet<Character>();
        
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i)))
                result++;
        }
        
        return result;
    }
}