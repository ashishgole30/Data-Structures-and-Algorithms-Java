/*
 * 3️⃣ Prefix Sum with Comparison Logic
 * 
 * 🔹 Concept
 * Used when:
 * Compare left sum vs right sum
 * Find pivot index
 * Find middle index
 * Instead of recalculating left and right sum every time,
 * we use prefix to calculate instantly.
 * 
 * 🔹 Idea
 * At index i:
 * Left sum = prefix[i-1]
 * Right sum = prefix[n-1] - prefix[i]
 * If both equal → condition satisfied.
 * 
 * 🔹 Steps
 * Build prefix array.
 * For every index:
 * Compute left sum.
 * Compute right sum.
 * Compare them.
 * 
 * 🔹 Very Simple Example
 * nums = [1,7,3,6,5,6]
 * prefix = [1,8,11,17,22,28]
 * At index 3:
 * Left sum:
 * prefix[2] = 11
 * Right sum:
 * prefix[5] - prefix[3]
 * = 28 - 17
 * = 11
 * Since equal → index 3 is pivot.
 * 
 * 🔹 Template
 * // After building prefix
 * for(int i = 0; i < n; i++){
 * int left = (i == 0) ? 0 : prefix[i-1];
 * int right = prefix[n-1] - prefix[i];
 * if(left == right){
 * // condition satisfied
 * }
 * }
 */