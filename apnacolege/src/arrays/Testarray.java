package arrays;



	public class Testarray {
		
		
		
		
		 public static int findMaxSubarraySum(int[] nums) {
		        int maxSoFar = Integer.MIN_VALUE;
		        int maxEndingHere = 0;
		        
		        for (int i = 0; i < nums.length; i++) {
		            maxEndingHere = maxEndingHere + nums[i];
		            
		            if (maxSoFar < maxEndingHere) {
		                maxSoFar = maxEndingHere;
		            }
		            
		            if (maxEndingHere < 0) {
		                maxEndingHere = 0;
		            }
		        }
		        
		        return maxSoFar;
		    }
		    
		    public static void main(String[] args) {
		        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
		        int maxSum = findMaxSubarraySum(nums);
		        System.out.println("Maximum subarray sum: " + maxSum);
		    }
		    
		    
		    
		    // kadanes algorithm for max sum of sub array
		
//	    public static int findMaxSubarraySum(int[] nums) {
//	        int maxSoFar = Integer.MIN_VALUE;
//	        int maxEndingHere = 0;
//	        
//	        for (int i = 0; i < nums.length; i++) {
//	            maxEndingHere = maxEndingHere + nums[i];
//	            
//	            if (maxSoFar < maxEndingHere) {
//	                maxSoFar = maxEndingHere;
//	            }
//	            
//	            if (maxEndingHere < 0) {
//	                maxEndingHere = 0;
//	            }
//	        }
//	        
//	        return maxSoFar;
//	    }
//	    
//	    public static void main(String[] args) {
//	        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
//	        int maxSum = findMaxSubarraySum(nums);
//	        System.out.println("Maximum subarray sum: " + maxSum);
//	    }
	}


