package DSA;

class DSA {

    public static int pivot(int nums[]){
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                return i;
            }
        }
        return 0;
    }

    public int search(int[] nums, int target) {
        int min = pivot(nums);

        if(nums[min] <= target && target <= nums[nums.length-1]){

            return search(nums,min,nums.length-1,target);
        }
        else{
            return search(nums,0,min,target);
        }
    }

    public static int search(int[] nums, int left, int right, int target){
        int l = left;
        int r = right;

        while(l <= r){
            int mid = (l + r) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
}









