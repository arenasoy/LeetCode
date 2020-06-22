package problems;

import java.util.HashMap;

public class VerifyingAnAlienDictionary0953 {

    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        
        for (int i = 1; i < words.length; i++) {
            
            String first = words[i - 1];
            String second = words[i];
            
            for (int j = 0; j < first.length(); j++) {
                
                if (second.length() == j) {
                    return false;
                }
                
                if (map.get(first.charAt(j)) < map.get(second.charAt(j))) {
                    break;
                } else if (map.get(first.charAt(j)) > map.get(second.charAt(j))) {
                    return false;
                }
            }
            
        }
        
        return true;
        
    }

}