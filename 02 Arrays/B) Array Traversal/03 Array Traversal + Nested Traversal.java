// ARRAY TRAVERSAL + NESTED TRAVERSAL
/*
 * Array Traversal + Nested Traversal Pattern (General Notes)
 * Definition:
 * Array Traversal + Nested Traversal is a pattern where one loop iterates
 * through the array and another loop iterates through elements inside it,
 * allowing comparison or processing of multiple elements relative to each
 * other.
 * 
 * 1️⃣ Basic Idea
 * Instead of looking at one element at a time, we examine pairs or groups of
 * elements.
 * Structure:
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < arr.length; j++) {
 * // logic using arr[i] and arr[j]
 * }
 * }
 * 
 * 2️⃣ Common Nested Traversal Structures
 * Case 1 – Compare every element with every other element
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < n; j++) {
 * // comparison
 * }
 * }
 * Used when all possible comparisons are needed.
 * 
 * Case 2 – Compare only unique pairs
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * // compare arr[i] and arr[j]
 * }
 * }
 * Used to avoid:
 * comparing an element with itself
 * duplicate comparisons
 * 
 * Case 3 – Traversing 2D arrays (matrix)
 * for (int i = 0; i < rows; i++) {
 * for (int j = 0; j < columns; j++) {
 * // access arr[i][j]
 * }
 * }
 * Used for:
 * matrices
 * grids
 * tables of data
 * 
 * 3️⃣ Typical Operations Using Nested Traversal
 * Nested traversal is used for:
 * Comparing elements
 * Generating pairs
 * Counting relationships between elements
 * Checking duplicates
 * Searching combinations
 * Traversing rows and columns of matrices
 * 
 * 4️⃣ Time Complexity
 * Most nested traversal patterns run in:
 * O(n²)
 * Reason:
 * Outer loop → n iterations
 * Inner loop → n iterations
 * Total → n × n
 * For matrices:
 * O(rows × columns)
 * 
 * 5️⃣ Key Concept
 * Key Idea
 * Pick one element → Compare it with remaining elements
 * Nested traversal means:
 * For each element,
 * examine other elements
 * or
 * Process elements in multiple dimensions
 */