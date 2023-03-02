public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,6};
        System.out.println(solution.searchInsert(nums, 5));
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = 0;
        for(int i =0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }
            if(target > nums[i]){
                answer = i+1;
            }
        }
        return answer;
    }
}

