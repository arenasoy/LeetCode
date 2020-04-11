package problems;

public class BackspaceStringCompare0844 {

    public boolean backspaceCompare(String S, String T) {
        
        if (S == null && T == null) return true;
        if (S == null || T == null) return false;
        
        int lenS = S.length();
        int lenT = T.length();
        
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < lenS; i++) {
            if (S.charAt(i) == '#' && s.length() > 0) {
                s.setLength(s.length() - 1);
            } else if (S.charAt(i) != '#') {
                s.append(S.charAt(i));
            }
        }
        
        StringBuilder t = new StringBuilder();
        
        for (int i = 0; i < lenT; i++) {
            if (T.charAt(i) == '#' && t.length() > 0) {
                t.setLength(t.length() - 1);
            } else if (T.charAt(i) != '#') {
                t.append(T.charAt(i));
            }
        }
        
        return (s.toString().equals(t.toString()));
    }

}