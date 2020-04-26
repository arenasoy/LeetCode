package problems;

public class JumpGame0055 {

    private boolean visited[];
    
    public boolean canJump(int[] nums) {
        visited = new boolean[nums.length];
        
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        
        return jump(nums, 0);
    }
    
    private boolean jump(int[] nums, int index) {
        
        if (index == nums.length - 1) {
            return true;
        }
        
        int cur = nums[index];
        
        boolean result = false;
        
        for (int i = index + 1; i <= index + cur && i < nums.length; i++) {
            
            if (visited[i])
                continue;
            
            result = jump(nums, i);
            visited[i] = true;
            
            if (result)
                break;
        }
        
        return result;
    } 

}