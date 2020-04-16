package problems;

public class ProductOfArrayExceptSelf0238 {

    public int[] productExceptSelf(int[] nums) {
        
        int output[] = new int [nums.length];
        output[nums.length - 1] = nums[nums.length - 1];
        
        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = output[i + 1] * nums[i];
        }
        
        int mul = 1;
        
        for (int i = 0; i < nums.length; i++) {
            
            output[i] = mul;
            
            if (i + 1 < nums.length)
                output[i] *= output[i + 1];
            
            mul *= nums[i];
        
        }
        
        return output;
    }
}
