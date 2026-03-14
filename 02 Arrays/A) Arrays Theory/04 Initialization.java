// Initialization

/*
 * Initialization of Arrays in Java
 * Definition:
 * Initialization means assigning values to the array elements.
 * 
 * 1️⃣ Static Initialization (At the time of declaration)
 * ✅ Method 1 – Direct Initialization
 * int[] arr = {10, 20, 30, 40};
 * Size automatically determined (4)
 * Values assigned immediately
 * 
 * ✅ Method 2 – Using new Keyword
 * int[] arr = new int[]{10, 20, 30, 40};
 * Same result, just more explicit.
 * 
 * 2️⃣ Dynamic Initialization (After Allocation)
 * Step 1 – Declare + Allocate
 * int[] arr = new int[4];
 * Step 2 – Assign values later
 * arr[0] = 10;
 * arr[1] = 20;
 * arr[2] = 30;
 * arr[3] = 40;
 * 
 * 3️⃣ Default Initialization (Important for Exams)
 * If you allocate memory but don’t assign values:
 * int[] arr = new int[3];
 * Default values will be:
 * Data Type Default Value
 * int 0
 * double 0.0
 * boolean false
 * char '\u0000'
 * String / Objects null
 * 
 * Quick Summary
 * Type When Used
 * Static Initialization When values are known beforehand
 * Dynamic Initialization When values are assigned later
 * Default Initialization When only memory is allocated
 */