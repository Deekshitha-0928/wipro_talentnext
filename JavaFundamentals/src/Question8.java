import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if((ch>='A' && ch<='Z') || (ch>='a' && ch<='b')) {
    	 System.out.println("Alphabhet");
     }
     else if(ch>='0' && ch<='9') {
    	 System.out.println("Integer");
     }
     else {
    	 System.out.println("Special Character");
     }
	}

}
