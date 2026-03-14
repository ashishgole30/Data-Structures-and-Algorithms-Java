// Types Of Arrays
/*
 * Types of Arrays in Java
 * 
 * 1️⃣ One Dimensional Array (1D Array)
 * Definition:
 * An array that stores elements in a single row (linear sequence).
 * Example:
 * int[] arr = {10, 20, 30, 40};
 * Memory Representation:
 * Index: 0 1 2 3
 * Value: 10 20 30 40
 * Access Element:
 * arr[2] → 30
 * Traversal Example:
 * for(int i = 0; i < arr.length; i++)
 * Used For:
 * Lists of numbers
 * Scores
 * Hours worked
 * Simple data collections
 * 
 * 2️⃣ Two Dimensional Array (2D Array)
 * Definition:
 * An array that stores elements in rows and columns (matrix form).
 * Example:
 * int[][] arr = {
 * {1, 2, 3},
 * {4, 5, 6}
 * };
 * Memory Representation:
 * Row 0 → 1 2 3
 * Row 1 → 4 5 6
 * Access Element:
 * arr[1][2] → 6
 * Traversal Example:
 * for(int i = 0; i < rows; i++)
 * for(int j = 0; j < columns; j++)
 * Used For:
 * Matrices
 * Grids
 * Game boards
 * Bank accounts (LeetCode 1672)
 * 
 * 3️⃣ Multi Dimensional Array (3D or More)
 * Definition:
 * Array containing arrays inside arrays inside arrays.
 * Example:
 * int[][][] arr = new int[2][3][4];
 * Structure:
 * Layer → Row → Column
 * Used For:
 * Complex data structures
 * 3D grids
 * Scientific computing
 */