package problems;

public class FirstBadVersion0278 {

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    boolean isBadVersion(int version) {
        return false;
    };

    public int firstBadVersion(int n) {
        
        if (isBadVersion(0)) return 0;
        if (!isBadVersion(n)) return -1;
        
        return binarySearch(1, n);
        
    }
    
    private int binarySearch(int start, int end) {
        
        if (start >= end) return start;
        
        int mid = start + (end - start)/2;

        if (isBadVersion(mid)) {
            return binarySearch(start, mid);
        }
        
        return binarySearch(mid + 1, end);
    }

}