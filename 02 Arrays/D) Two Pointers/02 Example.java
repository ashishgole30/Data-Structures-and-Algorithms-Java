/*
 * Problem: Check if array has two numbers whose sum = target
 * nums = [1, 2, 3, 4, 6]
 * indices = [0,1,2,3,4]
 * target = 6
 * Brute Force Idea:
 * Check all pairs:
 * (1,2), (1,3), (1,4), ...
 * Time = O(n²)
 * 
 * Two Pointers Idea:
 * Since array is sorted:
 * left = 0 index value → 1
 * right = 4 index value → 6
 * Step 1:
 * 1 + 6 = 7 > target
 * Move right leftwards
 * Step 2:
 * 1 + 4 = 5 < target
 * Move left rightwards
 * Step 3:
 * 2 + 4 = 6
 * Found answer.
 * 
 * Core Idea:
 * At every step:
 * If sum > target → decrease right index
 * If sum < target → increase left index
 * One-Line Understanding
 * Use two ends of array and move them intelligently instead of checking all
 * pairs.
 */