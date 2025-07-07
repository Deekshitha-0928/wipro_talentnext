import java.util.*;
public class array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] num=new int[n];
     boolean s=false;
     for(int i=0;i<n;i++) {
    	 num[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++) {
    	 if(num[i]!=1 && num[i]!=4) {
    		 s=true;
    	 }
     }
     System.out.println(!s);
	}

}
