package problems;

import java.util.Stack;

public class ValidateStackSequences0946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int push = 0, pop = 0;
        int pushedLength = pushed.length;
        int poppedLength = popped.length;
        
        while(push < pushedLength && pop < poppedLength) {
            
            if (stack.size() > 0 && stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            } else {
                stack.push(pushed[push]);
                push++;
            }
            
        }
        
        while (pop != poppedLength) {
            if (stack.peek() != popped[pop]) {
                return false;
            }
            
            stack.pop();
            pop++;
        }
        
        return true;
    }
}