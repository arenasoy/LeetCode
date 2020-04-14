package problems;

public class PerformStringShitfs {
    
    public String stringShift(String s, int[][] shift) {
        
        int right = 0;
        
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                right -= shift[i][1];
            } else {
                right += shift[i][1];
            }
        }
        
        int length = s.length();
        right %= length;
        
        if (right == 0)
            return s;
        
        StringBuilder sb = new StringBuilder();
        
        if (right < 0) {
            sb.append(s.substring(-1 * right));
            sb.append(s.substring(0, -1 * right));
        } else {
            sb.append(s.substring(length - right));
            sb.append(s.substring(0, length - right));
        }
        
        return sb.toString();
    }
    
}