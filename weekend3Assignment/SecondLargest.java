package weekend3Assignment;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 2, 11, 4, 6, 7};
		Arrays.sort(a);
		System.out.println(a[(a.length)-2]);
	}

}
