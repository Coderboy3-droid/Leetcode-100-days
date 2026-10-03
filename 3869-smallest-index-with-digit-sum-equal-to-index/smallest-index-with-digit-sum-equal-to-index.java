class Solution {
    public int smallestIndex(int[] nums) {
        int temp , sum , rem;
        for (int i = 0 ; i <nums.length ; i++){
            temp = nums[i];
            sum = 0;
            while (temp!=0){
                rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }
            if (sum == i){
                return i;
            }
        }
        return -1; 
    }
}