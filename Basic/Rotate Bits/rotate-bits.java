//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        
         ArrayList<Integer> arr = new ArrayList<>();
        
        String s = Integer.toBinaryString(N);
        
        int len = s.length();
        
        for(int i=0;i<16-len;i++){
            s = "0"+s;
        }

        len = 16;
        
        if(D > len){
            D = D%16;
        }
        else if( D == len){
            arr.add(N);
            arr.add(N);
            return arr;
        }

        String left = "";
        String right = "";
        
        for(int i=D;i<len;i++){
            left = left + s.charAt(i);
        }
        for(int i=0;i<D;i++){
            left = left + s.charAt(i);
        }
      
        right = right + s.substring(0,len-D);
        
        int i=0;
        int j = len-1;
        while(i<D){
            right = s.charAt(j--) + right;
            i++;
        }
       
        int ans1 = Integer.parseInt(left,2);
        int ans2 = Integer.parseInt(right,2);
        
        arr.add(ans1);
        arr.add(ans2);
        
        return arr;
        
    }
}