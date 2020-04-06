package problems;

import java.util.Arrays;

public class ValidAnagram0242 {
    public boolean isAnagram(String s, String t) {
        
        if (s == null && t == null) return true;
        if (s.length() != t.length()) return false;
        
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i])
                return false;
        }
        
        return true;
    }
}