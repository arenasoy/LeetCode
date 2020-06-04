package problems;

public class ReverseString0344 {
    public void reverseString(char[] s) {
        
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char aux = s[i];
            s[i] = s[j];
            s[j] = aux;
        }
    }    
}