public class Unique{  

    public static int findUnique(int[] arr){
		//Your code goes here
       for(int i=0 ; i< arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				return arr[i];
			}
		}
		return -1;
        
    }
    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        
        int y = findUnique(arr);
        System.out.println(y);

    }
}