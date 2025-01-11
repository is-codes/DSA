package DSA;

public class searchinsert {
    
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left=0, right=n-1;
            while(left <= right){
                int mid = (left + right)/2;
                if(nums[mid] == target) return mid;
                else if(nums[mid] < target) left = mid+1;
                else right = mid-1;
            }
            return right+1;
        }
    }

