
import java.util.*;
public class array14 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[][] arr=new int[3][3];
int max=Integer.MIN_VALUE;
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
arr[i][j]=sc.nextInt();
if(arr[i][j]>max) {
max=arr[i][j];
}
}
}System.out.println("maximum number in array" + max);
}
}