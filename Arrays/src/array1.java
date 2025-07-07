import java.util.*;
public class array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] num= new int[5];  
        int sum = 0;

        // calculate sum
        for (int i=0;i<5;i++) {
        	num[i]=sc.nextInt();
            sum += num[i];
        }
        double average = (double) sum / num.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
	}

}
