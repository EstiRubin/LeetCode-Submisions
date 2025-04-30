class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // מיון המערך
        int closestSum = nums[0] + nums[1] + nums[2]; // אתחול עם הסכום הראשון האפשרי

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                // אם מצאנו סכום שווה בדיוק למטרה, אין צורך להמשיך
                if (currSum == target) {
                    return currSum;
                }

                // עדכון אם מצאנו סכום קרוב יותר
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                // התקדמות של המצביעים בהתאם לגודל הסכום ביחס למטרה
                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}