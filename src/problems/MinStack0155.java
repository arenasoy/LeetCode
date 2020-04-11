package problems;

import java.util.Stack;

class MinStack0155 {

    class Pair {
        int value;
        int min;
    }
    
    private Stack<Pair> s;
    
    /** initialize your data structure here. */
    public MinStack0155() {
        s = new Stack<Pair>();    
    }
    
    public void push(int x) {
        Pair p = new Pair();
        p.value = x;
        p.min = x;
        
        if (!s.empty()) {
            Pair top = s.peek();
            if (p.min > top.min) {
                p.min = top.min;
            }
        }
        
        s.push(p);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().value;                
    }
    
    public int getMin() {
        return s.peek().min;
    }
}