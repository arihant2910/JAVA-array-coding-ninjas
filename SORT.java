public class SORT {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int count = 0; // counts the no of zeros in arr
    	int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }
    public static void main(String[] args){
        int arr[] = {1,0,1,1,1,0,0,0,1,1};
        sortZeroesAndOne(arr);
    }
    
}