/*
 * Partition Type (Swap Logic)
 * Super Simple Concept
 * You want to separate elements
 * left side = correct
 * right side = correct
 * swap wrong ones
 * 
 * Think like this:
 * Left should have A
 * Right should have B
 * If wrong → swap
 * 
 * When to use
 * Even–odd separation
 * 0s and 1s
 * Negatives/positives
 * 
 * Template:
 * int left = 0;
 * int right = nums.length - 1;
 * 
 * while (left < right) {
 * 
 * if (nums[left] % 2 == 0) {
 * left++; // already correct
 * }
 * else if (nums[right] % 2 != 0) {
 * right--; // already correct
 * }
 * else {
 * // swap
 * int temp = nums[left];
 * nums[left] = nums[right];
 * nums[right] = temp;
 * 
 * left++;
 * right--;
 * }
 * }
 */