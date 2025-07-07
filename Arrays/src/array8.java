import java.util.*;
public class array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1= {10,3,6,1,2,1,7,9};
    System.out.println(sumArray(arr1));
	}
	public static int sumArray(int[] arr) {
        int sum = 0;
        boolean ignore = false;

        for (int num : arr) {
            if (num == 6) {
                ignore = true;
            } else if (num == 7 && ignore) {
                ignore = false;
            } else if (!ignore) {
                sum += num;
            }
        }

        return sum;

}
}