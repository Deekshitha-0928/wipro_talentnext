import java.util.*;
public class array9{
	public static void main(String[] args) {
		int[] arr1= {1,10,15,10};
		int[] arr2= {2,10,25,10};
		System.out.println("Result 1: " + Arrays.toString(withoutTen(arr1)));
		System.out.println("Result 2: " + Arrays.toString(withoutTen(arr2)));
		
	}
	public static int[] withoutTen(int[] nums) {
		int[] result=new int[nums.length];
		int index=0;
		for(int num:nums) {
			if(num!=10) {
				result[index]=num;
				index++;
			}
		}
		return result;
	}
}