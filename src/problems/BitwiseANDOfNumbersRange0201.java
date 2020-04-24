package problems;

public class BitwiseANDOfNumbersRange0201 {

    public int rangeBitwiseAnd(int m, int n) {
        int result = n; 
        
        for (int i = n - 1; i >= m; i--) {
            
            result = result & i;
            i = result;
        }
        
        return result;
    }

}