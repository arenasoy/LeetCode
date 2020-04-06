package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hash = new HashMap<String, List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            
            char sorted[] = strs[i].toCharArray();
            Arrays.sort(sorted);
            
            List<String> list = hash.getOrDefault(String.valueOf(sorted), new ArrayList<String>());
            list.add(strs[i]);
            
            hash.put(String.valueOf(sorted), list);
        }
        
        List<List<String>> result = new ArrayList<List<String>>();
        for(String key : hash.keySet()) {
            result.add(hash.get(key));
        }
        
        return result;
    }

}