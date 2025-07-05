import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int rem=0;
    for(;n>0;n=n/10) {
    	rem+=n%10;
    }System.out.println("sum of digits:" + rem);
	}

}
