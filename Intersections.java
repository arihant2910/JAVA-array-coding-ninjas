
public class Intersections{
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        for(int i=0 ; i< arr1.length;i++) {
			int duplicate=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MAX_VALUE;
					break;
				}
			}
			
		}
	
    }
    public static void main(String[] args){
        int arr1[] = {23,45,67,98,12};
        int arr2[] = {23,45,67,98,12};
        intersections(arr1,arr2);


    }
}