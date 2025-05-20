import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (hash.containsKey(complement)) {
                return new int[] {hash.get(complement)+1, i+1};
            }
            hash.put(numbers[i], i);
        }
        return new int[0]; 
    }
}
