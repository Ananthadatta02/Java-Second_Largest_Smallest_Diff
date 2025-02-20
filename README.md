# Difference Between 2nd Largest and 2nd Smallest Element in an Array

## Introduction
This Java program calculates the difference between the second-largest and second-smallest elements in an array entered by the user. It takes an array of integers as input, sorts the array using a nested loop (bubble sort logic), and then computes the required difference.

## Code Explanation

```java
package largest_And_Smallest_Operations;

import java.util.Arrays;
import java.util.Scanner;

public class Diff_bw_2ndLargest_2ndSmallest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println("Array " + Arrays.toString(arr));

        // Sorting the array using a nested loop
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[i])
                {
                    // Swapping arr[i] and arr[j]
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println("Sorted Array " + Arrays.toString(arr));

        int diff = arr[arr.length - 2] - arr[1];
        System.out.println("Difference b/w 2nd Largest & 2nd Smallest is " + diff);
    }
}
```

## Step-by-Step Explanation

### 1. **User Input**
- The program starts by asking the user to enter the size of the array.
- Then, the user is prompted to enter elements of the array.
- The entered elements are stored in the array `arr`.

### 2. **Displaying the Input Array**
- The `Arrays.toString(arr)` method is used to display the entered array before sorting.

### 3. **Sorting the Array**
- The program uses a nested loop structure to sort the array in ascending order.

#### **Outer Loop (`for` loop)**
```java
for(int i = 0; i < arr.length; i++)
```
- The outer loop iterates through each element of the array.

#### **Inner Loop (`for` loop)**
```java
for(int j = 0; j < i; j++)
```
- The inner loop compares the current element `arr[i]` with all previous elements `arr[j]`.
- If `arr[j] > arr[i]`, a swap operation is performed.

### 4. **Swapping the Elements**
```java
arr[i] = arr[i] + arr[j];
arr[j] = arr[i] - arr[j];
arr[i] = arr[i] - arr[j];
```
- This is an in-place swapping technique using arithmetic operations without a temporary variable.
- The swap ensures that smaller elements move towards the beginning of the array, resulting in a sorted array at the end.

### 5. **Displaying the Sorted Array**
```java
System.out.println("Sorted Array " + Arrays.toString(arr));
```
- After sorting, the program prints the sorted array.

### 6. **Finding the Difference Between the 2nd Largest and 2nd Smallest Elements**
```java
int diff = arr[arr.length - 2] - arr[1];
```
- `arr[arr.length - 2]` represents the **second-largest** element (since the array is sorted in ascending order).
- `arr[1]` represents the **second-smallest** element.
- The difference between these two values is stored in the `diff` variable.

### 7. **Displaying the Result**
```java
System.out.println("Difference b/w 2nd Largest & 2nd Smallest is " + diff);
```
- The final computed difference is displayed as the output.

## Example Execution

### **Input:**
```
Enter the size
5
Enter the elements
10 3 5 8 2
```

### **Intermediate Output:**
```
Array [10, 3, 5, 8, 2]
Sorted Array [2, 3, 5, 8, 10]
```

### **Final Output:**
```
Difference b/w 2nd Largest & 2nd Smallest is 5
```

## Conclusion
- The program correctly calculates the difference between the second-largest and second-smallest elements.
- The sorting method can be optimized using `Arrays.sort()`.
- Proper input validation should be included to handle small arrays.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Second_Largest_Smallest_Diff.git
```
