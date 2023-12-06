package practiceWordTabularquestionsOnNoSysArrayString;

public class DivideandConquerMaxElementInArray {
	

	    // Function to find the maximum element in an array using divide-and-conquer
	    public static int findMax(int[] arr) {
	        return findMaxHelper(arr, 0, arr.length - 1);
	    }

	    private static int findMaxHelper(int[] arr, int start, int end) {
	        if (start == end) {
	            return arr[start];  // Base case: when only one element is left
	        }

	        // Calculate mid index
	        int mid = start + (end - start) / 2;
	        System.out.print(mid+" ");

	        // Recur for the left and right subarrays
	        int leftMax = findMaxHelper(arr, start, mid);
	      
	        int rightMax = findMaxHelper(arr, mid + 1, end);
	      

	        // Return the maximum of leftMax and rightMax
	        return Math.max(leftMax, rightMax);
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 7, 3, 5, 15};
	        int max = findMax(arr);
	        System.out.println("The maximum element in the array is: " + max); // Output: 15
	    }
	}


