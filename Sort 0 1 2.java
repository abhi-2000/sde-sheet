public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else if(arr[i]==2)
                 c2++;
                
        }
        int pos=0;
        while(c0>0)
        {
            arr[pos]=0;
            c0--;
            pos++;
        }
        while(c1>0)
        {
            arr[pos]=1;
            c1--;
            pos++;

        }
        while(c2>0)
        {
            arr[pos]=2;
            pos++;
            c2--;

        }

    
    }
}
