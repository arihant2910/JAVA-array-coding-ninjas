
public class SwapAlt {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int temp=0;
        int i = 0;
        while (i < arr.length- 1) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i = i + 2;
        }
    }

    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        int x = 23;
         swapAlternate(arr);
       // System.out.println(y);

    }
}