package problems;

public class ValidParenthesistring0678 {

    public boolean checkValidString(String s) {
        
        int min = 0;
        int max = 0;
        
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                min++;
                max++;
            }
            else if (cur == ')') {
                min--;
                max--;
            } else if (cur == '*') {
                max++;
                min--;
            }
            
            if (min < 0)
                min = 0;
            
            if (max < 0)
                return false;
        }
        
        if (min == 0)
            return true;
        
        return false;
    
    }

}