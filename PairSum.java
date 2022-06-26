public class PairSum {  

    public static int pairSum(int arr[], int x) {
        int count = 0; // Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == x)
                    count++;
        return count;
    }
    
    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        int x = 68;
        int y = pairSum(arr,x);
        System.out.println(y);

    }
}