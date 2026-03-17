/*
 * Three Pointers / Dutch National Flag Problem
 * 
 * 1️⃣ Concept
 * Three pointers: low, mid, high
 * Purpose: Partition array into three zones based on value/condition.
 * low → next position for smallest value (e.g., 0)
 * mid → current element being checked
 * high → next position for largest value (e.g., 2)
 * Scan with mid from start to high
 * Swap elements to correct zones based on value
 * 
 * 2️⃣ Formula / Steps
 * Initialize:
 * low = 0, mid = 0, high = n-1;
 * While mid <= high:
 * if nums[mid] == 0:
 * swap(nums[low], nums[mid]);
 * low++; mid++;
 * else if nums[mid] == 1:
 * mid++; // already in correct middle zone
 * else: // nums[mid] == 2
 * swap(nums[mid], nums[high]);
 * high--; // mid not incremented, check new value at mid
 * 
 * 3️⃣ When to Use
 * Array has exactly 3 distinct categories / values
 * Need in-place sorting / partitioning
 * Examples:
 * 0, 1, 2 → Sort Colors (LeetCode 75)
 * <x, =x, >x → Partition array around pivot
 * 
 * 4️⃣ Very Short Java Template
 * public void threePointersSort(int[] nums) {
 * int low = 0, mid = 0, high = nums.length - 1;
 * while (mid <= high) {
 * if (nums[mid] == 0) {
 * int temp = nums[low];
 * nums[low] = nums[mid];
 * nums[mid] = temp;
 * low++; mid++;
 * } else if (nums[mid] == 1) {
 * mid++;
 * } else { // nums[mid] == 2
 * int temp = nums[mid];
 * nums[mid] = nums[high];
 * nums[high] = temp;
 * high--;
 * }
 * }
 * }
 * 
 * 5️⃣ Example
 * Input: [2,0,2,1,1,0]
 * Step-by-step:
 * 
 * Initial: low=0, mid=0, high=5 -> [2,0,2,1,1,0]
 * mid=0 -> nums[mid]=2, swap with nums[high]=0 -> [0,0,2,1,1,2], high=4
 * mid=0 -> nums[mid]=0, swap with nums[low]=0 -> low=1, mid=1
 * mid=1 -> nums[mid]=0, swap -> low=2, mid=2
 * mid=2 -> nums[mid]=2, swap with nums[high]=1 -> [0,0,1,1,2,2], high=3
 * mid=2 -> nums[mid]=1 -> mid=3
 * mid=3 -> nums[mid]=1 -> mid=4 > high=3 → done
 * 
 * ✅ Sorted: [0,0,1,1,2,2]
 */