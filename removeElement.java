class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[n - 1] = val;
                n--;
            }
        }
        return n;
    }
}

class Solution1 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

class Solution2 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        int i = 0;
        while (i < n) {
            if (val == nums[i]) {
                nums[i] = nums[n - 1];
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
}