import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int c=0;
     for(int i=1;i<=n;i++) {
    	 if(n%i==0) {
    		 c++;
    	}
     }
     if(c==2) {
    	 System.out.println(n + " is prime");
     }
     else {
    	 System.out.println(n + " is not prime");
     }
	}
}