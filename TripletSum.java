
public class TripletSum {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
    int count = 0; // Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                for(int k =j+1;k<arr.length;k++)
                if ((arr[i] + arr[j]+arr[k]) == x)
                    count++;
         return count;
    }
    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        int x =80;
        int y = findTriplet(arr,x);
        System.out.println(y);

    }
    

}