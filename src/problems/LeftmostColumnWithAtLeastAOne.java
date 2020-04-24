package problems;

import java.util.List;

public class LeftmostColumnWithAtLeastAOne {

    class BinaryMatrix {
       public int get(int x, int y) {
           return 0;
       }
       public List<Integer> dimensions() {
           return null;
       }
    };

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dim = binaryMatrix.dimensions();
        
        int i = 0;
        int j = dim.get(1) - 1;
        
        while (i < dim.get(0) && j >= 0) {
            
            if (binaryMatrix.get(i, j) == 1) {
                j--;
            } else {
                i++;
            }
            
        }
        
        if (j == dim.get(1) - 1 && i == dim.get(0))
            return -1;
        
        return j + 1;
    }
}
