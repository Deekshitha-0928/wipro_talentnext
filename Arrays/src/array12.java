import java.util.*;
public class array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int[] a=new int[3];
    int[] b=new int[3];
    int[] result=new int[2];
    for(int i=0;i<3;i++) {
    	a[i]=sc.nextInt();
    }
    for(int j=0;j<3;j++) {
    	b[j]=sc.nextInt();
    }
    result[0]=a[1];
    result[1]=b[1];
    for(int i=0;i<2;i++) {
    	System.out.println(result[i] + " ");
    }
	}

}
