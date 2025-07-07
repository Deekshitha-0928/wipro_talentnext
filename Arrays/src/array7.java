import java.util.*;
public class array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {2,21,45,51,99,21,51};
    Set<Integer> set = new LinkedHashSet<>();
    for (int num : arr) set.add(num);
    for (int num : set) System.out.print(num + " ");
	}

}
