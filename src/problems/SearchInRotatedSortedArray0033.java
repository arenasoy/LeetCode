package problems;

public class SearchInRotatedSortedArray0033 {
    
    public int search(int[] nums, int target) {
        
        if (nums.length == 0)
            return -1;
        
        return sub(nums, target, 0, nums.length - 1);
    }
    
    private int sub(int nums[], int target, int start, int end) {
        int mid = (end + start)/2;
        
        if (nums[mid] == target)
            return mid;
         
        if (end == start)
            return -1;
        
        if (start + 1 == end) {
            if (nums[start] == target)
                return start;
            if (nums[end] == target)
                return end;
            return -1;
        }
        
        if (nums[mid] < nums[end]) {
            if (target > nums[end] || target < nums[mid])
                return sub(nums, target, start, mid);
            return sub(nums, target, mid, end);
        }
        
        if (nums[mid] > nums[end]) {
            if (nums[start] <= target && target < nums[mid])
                return sub(nums, target, start, mid);
            return sub(nums, target, mid, end);
        }
        
        return -1;
    }
}