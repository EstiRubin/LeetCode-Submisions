class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num:nums){
            if(isEven(num))
                ans++;
        }
        return ans;
    }
    public Boolean isEven(int num){
        int x = 0;
        while(num>0){
            x++;
            num = num/10;
        }
        return x%2==0;
    }
}