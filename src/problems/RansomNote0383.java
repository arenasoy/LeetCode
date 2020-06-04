package problems;

import java.util.HashMap;

public class RansomNote0383 {
 
    //O(N) time, O(N) space
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        
        for (int i = 0; i < magazine.length(); i++) {
            int count = dic.getOrDefault(magazine.charAt(i), 0);
            dic.put(magazine.charAt(i), ++count);
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            
            int count = dic.getOrDefault(ransomNote.charAt(i), 0);
            
            if (count == 0)
                return false;
            
            dic.put(ransomNote.charAt(i), --count);
        }
        
        return true;
        
    }
}