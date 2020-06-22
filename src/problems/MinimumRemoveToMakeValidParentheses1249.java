package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses1249 {

    public String minRemoveToMakeValid(String s) {
        
        Set<Integer> remove = new HashSet<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    remove.add(i);
                } else {
                    stack.pop();
                }
            }
            
        }
        
        while (!stack.isEmpty()) {
            remove.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (!remove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }

}