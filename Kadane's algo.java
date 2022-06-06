import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long currsum=0;
        long maxsum=0;
        for(int i=0;i<n;i++)
        {
            currsum+=arr[i];
            if(currsum>maxsum)
                maxsum=currsum;
            if(currsum<0)
                currsum=0;
        }
//         if(maxsum==0)
//         {
//             int max=Integer.MIN_VALUE;
//             for(int i=0;i<n;i++)
//             {
//                 if(arr[i]>max)
//                     max=arr[i];
//             }
//             maxsum=max;
//         }
        return maxsum;
	}

}
