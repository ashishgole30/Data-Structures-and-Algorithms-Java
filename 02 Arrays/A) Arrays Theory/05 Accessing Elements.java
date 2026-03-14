// Accessing Elements

/*
 * Accessing Elements of Arrays in Java
 * Definition:
 * Accessing means retrieving or modifying a value stored at a specific index in
 * the array.
 * 
 * 1️⃣ Using Index
 * Array indexing starts from 0.
 * int[] arr = {10, 20, 30, 40};
 * 🔹 Access a value
 * System.out.println(arr[2]); // Output: 30
 * Meaning:
 * arr[2] → element at index 2
 * 
 * 2️⃣ Modify a value
 * arr[1] = 50;
 * Now array becomes:
 * 10 50 30 40
 * 
 * 3️⃣ Access Using Loop (Traversal)
 * Using for loop
 * for(int i = 0; i < arr.length; i++) {
 * System.out.println(arr[i]);
 * }
 * Using Enhanced for loop
 * for(int value : arr) {
 * System.out.println(value);
 * }
 * 
 * 4️⃣ Important Points
 * Index starts from 0
 * Last index = array.length - 1
 * Accessing invalid index causes:
 * ArrayIndexOutOfBoundsException
 * Quick Formula
 * First element → arr[0]
 * Last element → arr[arr.length - 1]
 */