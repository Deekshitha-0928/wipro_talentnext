import java.util.*;
public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {12,5,4,85,25,16};
    if(arr.length<2) {
    	System.out.println("Array must have atleast two elements");
    	return;
    }
    Arrays.sort(arr);
    System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
    System.out.println("Largest two: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
	}

}
