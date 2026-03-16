/*
 * 2️⃣ Prefix Sum for Range Queries
 * 
 * 🔹 Concept
 * Used when we need:
 * Sum from index L to R many times
 * Instead of recalculating again and again,
 * we use prefix to get answer in O(1).
 * 
 * 🔹 Key Formula
 * sum(L,R) = prefix[R] - prefix[L-1]
 * Special case:
 * If L = 0:
 * sum(0,R) = prefix[R]
 * 
 * 🔹 Steps
 * Build prefix array.
 * When asked sum from L to R:
 * If L == 0 → return prefix[R]
 * Else → return prefix[R] - prefix[L-1]
 * 
 * 🔹 Very Simple Example
 * nums = [4,2,1,3]
 * prefix = [4,6,7,10]
 * Find sum(1,3):
 * = prefix[3] - prefix[0]
 * = 10 - 4
 * = 6
 * Correct because:
 * 2 + 1 + 3 = 6
 * 
 * 🔹 Template
 * // Build prefix first
 * int sum;
 * if(L == 0){
 * sum = prefix[R];
 * } else {
 * sum = prefix[R] - prefix[L-1];
 * }
 */