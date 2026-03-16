/*
 * 1️⃣ Running Prefix Sum (Basic)
 * 
 * 🔹 Concept
 * Store cumulative sum from index 0 to i.
 * prefix[i] = sum of elements from 0 to i
 * Used when:
 * You need running total
 * You need cumulative value at every index
 * 
 * 🔹 Steps
 * Create prefix array of same size.
 * Set first element:
 * prefix[0] = nums[0]
 * Traverse from index 1 to n-1.
 * Add current number to previous prefix sum.
 * 
 * 🔹 Formula
 * prefix[i] = prefix[i-1] + nums[i]
 * 
 * 🔹 Very Simple Example
 * nums = [2,3,5]
 * Prefix becomes:
 * [2,5,10]
 * Because:
 * 2
 * 2+3 = 5
 * 5+5 = 10
 * 
 * 🔹 Template (Java)
 * int[] prefix = new int[n];
 * prefix[0] = nums[0];
 * for(int i = 1; i < n; i++){
 * prefix[i] = prefix[i-1] + nums[i];
 * }
 */