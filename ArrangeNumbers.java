package Arrays;

public class ArrangeNumbers  {
    
    public static void arrange(int[] arr, int n) {
    
        
        //Your code goes here
        for(int i=0;i<n;i++)
        {
            arr[i]=n;
        }
        for(int i=0;i<n/2;i++)
        {
            arr[i]=2*i+1;
            arr[n-1-i]=2*i+2;
        }
        
    }
    public static void main(String[] args){
        int n = 7;
        int arr[] = new int[n];
        
         arrange(arr, n);
        

    }
    
}