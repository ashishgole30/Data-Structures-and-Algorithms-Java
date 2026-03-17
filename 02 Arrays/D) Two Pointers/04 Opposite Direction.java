/*
 * 1. Opposite Direction (Start–End)
 * 🔹 Concept
 * One pointer at start, one at end
 * Move them towards each other
 * 🔹 When to Use
 * Sorted array
 * Pair sum problems
 * Palindrome checking
 * 🔹 Movement Rule (Formula)
 * If condition too big → right--
 * If condition too small → left++
 * If condition satisfied → return / process
 * 
 * Example:
 * nums = [1,2,3,4,6], target = 6
 * 1+6 > 6 → right--
 * 1+4 < 6 → left++
 * 2+4 = 6 ✅
 * 
 * Template:
 * int left = 0;
 * int right = nums.length - 1;
 * 
 * while (left < right) {
 * 
 * int sum = nums[left] + nums[right]; // example condition
 * 
 * if (sum == target) {
 * System.out.println("Found");
 * break;
 * }
 * else if (sum > target) {
 * right--; // decrease value
 * }
 * else {
 * left++; // increase value
 * }
 * }
 */