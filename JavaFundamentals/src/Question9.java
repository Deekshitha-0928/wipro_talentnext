import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		if(s.equalsIgnoreCase("female")) {
			if(n>=1 && n<=58) {
				System.out.println("8.2%");
			}
			else if(n>=59 && n<=100){
				System.out.println("9.2%");
			}
		}
		else if(s.equalsIgnoreCase("male")) {
			if(n>=1 && n<=58) {
				System.out.println("8.4%");
			}
			else if(n>=59 && n<=100){
				System.out.println("10.5%");
			}
		}

	}

}
