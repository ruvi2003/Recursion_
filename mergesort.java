package recursion;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public class MergeSort {
		    
		    // Main function that sorts the array using merge sort
		    public static void mergeSort(int[] array) {
		        if (array.length < 2) {
		            return; // Base case: if the array is of length 1 or less, it's already sorted
		        }
		        
		        int mid = array.length / 2;
		        int[] left = new int[mid];
		        int[] right = new int[array.length - mid];
		        
		        // Copying the left half of the array
		        for (int i = 0; i < mid; i++) {
		            left[i] = array[i];
		        }
		        
		        // Copying the right half of the array
		        for (int i = mid; i < array.length; i++) {
		            right[i - mid] = array[i];
		        }
		        
		        // Recursively sort the left and right halves
		        mergeSort(left);
		        mergeSort(right);
		        
		        // Merge the sorted halves
		        merge(array, left, right);
		    }
		    
		    // Function to merge two sorted subarrays into a single sorted array
		    public static void merge(int[] array, int[] left, int[] right) {
		        int i = 0, j = 0, k = 0;
		        
		        // Compare elements from left and right subarrays and copy the smaller element into the array
		        while (i < left.length && j < right.length) {
		            if (left[i] <= right[j]) {
		                array[k++] = left[i++];
		            } else {
		                array[k++] = right[j++];
		            }
		        }
		        
		        // Copy any remaining elements from the left subarray
		        while (i < left.length) {
		            array[k++] = left[i++];
		        }
		        
		        // Copy any remaining elements from the right subarray
		        while (j < right.length) {
		            array[k++] = right[j++];
		        }
		    }
		    
		    // Helper function to print the array
		    public static void printArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println();
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {38, 27, 43, 3, 9, 82, 10};
		        System.out.println("Original Array:");
		        printArray(array);
		        
		        mergeSort(array);
		        
		        System.out.println("Sorted Array:");
		        printArray(array);
		    }
		}

	}

}
