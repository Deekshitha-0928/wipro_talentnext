import java.util.*;
public class array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[2][2];
    for(int i=0;i<2;i++) {
    	for(int j=0;j<2;j++) {
    		arr[i][j]=sc.nextInt();
    		}}
    	for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		System.out.print(arr[i][j] +" ");
        	}
        	System.out.println();}
    	
        	for(int i=1;i>=0;i--) {
            	for(int j=1;j>=0;j--) {
            		System.out.print(arr[i][j] +" ");
            	}System.out.println();
    }
	}
	}
