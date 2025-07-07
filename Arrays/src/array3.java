import java.util.*;
public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int[] arr= {99,52,30,9,101};
     int search=52;
     int index=-1;
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]==search) {
    		 index=i;
    		 break;
    	 }
     }
     System.out.println(index);
	}

}
