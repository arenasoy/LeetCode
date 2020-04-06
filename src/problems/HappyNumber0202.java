package problems;

public class HappyNumber0202 {
    public boolean isHappy(int n) {
        int p1 = n;
        int p2 = n;
        
        do {
            
            int aux = 0;
            while (p1 > 0) {
                aux += (p1 % 10)*(p1 % 10);
                p1 /= 10;
            }
            
            p1 = aux;
            
            aux = 0;
            while (p2 > 0) {
                aux += (p2 % 10)*(p2 % 10);
                p2 /= 10;
            }
            
            p2 = aux;
            
            aux = 0;
            while (p2 > 0) {
                aux += (p2 % 10)*(p2 % 10);
                p2 /= 10;
            }
            
            p2 = aux;
            
        } while (p1 != p2);
        
        return (p1 == 1);
    }
}