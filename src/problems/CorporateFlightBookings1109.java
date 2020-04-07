package problems;

import java.util.Arrays;

public class CorporateFlightBookings1109 {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int result[] = new int[n];
        Arrays.fill(result, 0);
        
        for (int i = 0; i < bookings.length; i++) {
            for (int j = bookings[i][0] - 1; j < bookings[i][1]; j++) {
                result[j] += bookings[i][2];
            }
        }
        
        return result;
    }

}