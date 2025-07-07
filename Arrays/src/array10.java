import java.util.*;
public class array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,0,1,0,0,1,1};
      int[] result=evenOdd(arr);
      System.out.println("Output: " + Arrays.toString(result));
      
	}
	public static int[] evenOdd(int[] nums) {
		int[] newArray=new int[nums.length];
		int evenIndex=0;
		int oddIndex=nums.length-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				newArray[evenIndex]=nums[i];
				evenIndex++;
				
			}
			else {
				newArray[oddIndex]=nums[i];
				oddIndex--;
			}
		}
		return newArray;
	}

}
