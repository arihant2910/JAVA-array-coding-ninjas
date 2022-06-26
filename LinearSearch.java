package Arrays;

import java.util.Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
				flag=i;
            }
        
        }
        return flag;

       
    }

    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        int x = 23;
        int y = linearSearch(arr, x);
        System.out.println(y);

    }
}