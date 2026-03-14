// ARRAY TRAVERSAL + BASIC LOGIC PATERN

/*
 * Array Traversal + Basic Logic Pattern (Notes)
 * Definition:
 * A pattern where we traverse the array once and apply simple logic/conditions
 * on each element.
 * This is one of the most fundamental DSA patterns.
 * 
 * Pattern Structure:
 * Step 1 — Traverse the array
 * for (int i = 0; i < arr.length; i++)
 * Step 2 — Apply a condition / logic
 * Examples:
 * if(arr[i] > 10)
 * or
 * if(arr[i] == target)
 * Step 3 — Update a variable
 * Examples:
 * count++
 * sum += arr[i]
 * max = arr[i]
 * 
 * General Template:
 * int result = 0;
 * for (int i = 0; i < arr.length; i++) {
 * if (condition on arr[i]) {
 * result++;
 * }
 * }
 * 
 * Common Operations in This Pattern:
 * Operation Example
 * Counting count numbers > 10
 * Finding max maximum element
 * Finding min minimum element
 * Sum total of elements
 * Checking condition elements equal to target
 * 
 * Time Complexity:
 * O(n)
 * Because we visit each element once.
 * 
 * Key Idea:
 * Visit each element → Apply condition → Update result
 */