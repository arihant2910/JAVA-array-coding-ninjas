
public class Duplicate{  
    
    public static int duplicateNumber(int arr[]) {
        for(int i=0 ; i< arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					duplicate=true;
					break;
				}
			}
			if(duplicate) {
				return arr[i];
			}
		}
		return -1;
    	//Your code goes here
    }
    public static void main(String[] args){
        int arr[] = {23,45,67,98,12};
        
        int y = duplicateNumber(arr);
        System.out.println(y);

    }
}