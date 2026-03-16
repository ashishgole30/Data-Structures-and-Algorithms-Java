/*
 * 1️⃣ What Prefix Sum Is
 * Prefix Sum means:
 * Storing the sum of elements from the beginning of the array up to the current
 * index.
 * If:
 * nums = [2, 4, 6, 8]
 * Prefix array becomes:
 * prefix = [2, 6, 12, 20]
 * Because:
 * Index | Calculation | Prefix Value
 * 0 | 2 | 2
 * 1 | 2 + 4 | 6
 * 2 | 2 + 4 + 6 | 12
 * So:
 * prefix[i] = sum of elements from index 0 to i
 * 
 * 2️⃣ Why We Use Prefix Sum
 * Imagine this array:
 * nums = [2,4,6,8,10]
 * Suppose we want
 * sum from index 1 to 3
 * Without prefix sum:
 * 4 + 6 + 8 = 18
 * If we do this many times, we keep recalculating sums again and again.
 * That is slow.
 * 
 * 3️⃣ How Prefix Sum Saves Time
 * First build prefix array:
 * nums = [2,4,6,8,10]
 * prefix = [2,6,12,20,30]
 * Now any range sum becomes:
 * sum(L → R) = prefix[R] − prefix[L-1]
 * Example:
 * sum(1 → 3)
 * = prefix[3] − prefix[0]
 * = 20 − 2
 * = 18
 * Only 2 operations instead of looping.
 * 
 * 4️⃣ Prefix Sum Algorithm
 * Step-by-step algorithm
 * Take input array nums
 * Create new array prefix of same size
 * Set first element
 * prefix[0] = nums[0]
 * Traverse from index 1 to n-1
 * Add current number to previous prefix sum
 * prefix[i] = prefix[i-1] + nums[i]
 * Continue until array ends.
 * 
 * 5️⃣ Java Example
 * Input array
 * nums = [3,1,4,2]
 * Java code
 * int[] nums = {3,1,4,2};
 * int n = nums.length;
 * int[] prefix = new int[n];
 * prefix[0] = nums[0];
 * for(int i = 1; i < n; i++){
 * prefix[i] = prefix[i-1] + nums[i];
 * }
 * for(int x : prefix){
 * System.out.print(x + " ");
 * }
 * Output
 * 3 4 8 10
 * Because:
 * 3
 * 3+1 = 4
 * 4+4 = 8
 * 8+2 = 10
 */
