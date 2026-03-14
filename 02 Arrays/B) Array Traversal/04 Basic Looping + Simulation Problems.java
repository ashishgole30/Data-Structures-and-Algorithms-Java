// BASIC LOOPING + SIMULATION PROBLEMS

/*
 * Basic Looping + Simulation Pattern (Notes)
 * 1️⃣ Definition
 * Basic Looping + Simulation means:
 * Repeatedly perform operations step-by-step until a condition becomes false.
 * You simulate the process exactly as described in the problem.
 * 
 * 2️⃣ Core Structure
 * Usually uses a while loop.
 * while (condition) {
 * // perform operation
 * // update state
 * }
 * 
 * 3️⃣ Key Components
 * ✔ Loop Condition
 * When should the process continue?
 * When should it stop?
 * Example:
 * while (n != 0)
 * 
 * ✔ State Variables
 * Variables that keep changing inside the loop.
 * Examples:
 * n
 * num1, num2
 * count
 * sum
 * product
 * 
 * ✔ Update Step
 * Inside the loop, something must change.
 * Example:
 * n = n / 10;
 * count++;
 * If nothing changes → infinite loop.
 * 
 * 4️⃣ Common Operations in Simulation Problems
 * Operation Type Example
 * Counting steps count++
 * Digit extraction n % 10
 * Digit removal n / 10
 * Repeated subtraction a = a - b
 * Conditional branching if-else inside loop
 * 
 * 5️⃣ General Template
 * int count = 0;
 * while (condition) {
 * if (some condition) {
 * // modify state
 * } else {
 * // modify state differently
 * }
 * count++;
 * }
 * 
 * 6️⃣ Time Complexity
 * Usually:
 * O(k)
 * Where k = number of loop iterations.
 * Examples:
 * Digit problems → O(number of digits) → O(log n)
 * Subtraction simulation → depends on values
 * 
 * 7️⃣ When to Recognize This Pattern
 * You likely have a simulation problem when:
 * Problem says “repeat until”
 * You must reduce a number gradually
 * You work with digits
 * You simulate operations step-by-step
 * No arrays involved
 * No complex data structures involved
 * 
 * 8️⃣ Key Thinking Formula
 * Understand the process →
 * Simulate it step by step →
 * Update variables →
 * Stop at correct condition
 * 
 * 9️⃣ Important Rule
 * Always ensure:
 * Inside the loop → something changes.
 * Otherwise → infinite loop.
 * This pattern builds:
 * Loop control mastery
 * Condition handling
 * State tracking
 */