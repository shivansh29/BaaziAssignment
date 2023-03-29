package com.Assignment.Question1;

public class BalancedArray {

	public static void main(String[] args) {
		 int arr[] = { 1,2,3,4,6};
	     System.out.println("Pivot Index is "+ balancedSum(arr, arr.length));

	}
	
	static int balancedSum(int elements[], int length)
    {
        int right = 0, left = 0;
      
        // Computing right_sum
        for (int i = 1; i < length; i++)
            right += elements[i];
      
        // Checking the point of partition by comparing if left == right
        // right has sum of elements from 1 to n-1 index
        // Now we start subtracting the elements from right and adding in left and compare if left == right
        for (int i = 0, j = 1; j < length; i++, j++) {
            right -= elements[j];
            left += elements[i];
      
            if (left == right)
                return i+1;
        }
      
        return -1;
    }

}
