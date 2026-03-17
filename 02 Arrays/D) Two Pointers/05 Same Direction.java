/*
 * 2. Same Direction (→ →) (Slow–Fast)
 * Super Simple Concept
 * Both pointers move forward, but:
 * fast = scans
 * slow = builds answer
 * 
 * Think like this:
 * fast finds good elements
 * slow stores them
 * 
 * When to use
 * Remove duplicates
 * Move zeroes
 * Filtering
 * 
 * Template:
 * int slow = 0;
 * 
 * for (int fast = 0; fast < nums.length; fast++) {
 * 
 * if (nums[fast] != 0) { // condition (example)
 * nums[slow] = nums[fast];
 * slow++;
 * }
 * }
 */