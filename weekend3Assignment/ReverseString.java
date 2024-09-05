package weekend3Assignment;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		Arrays.sort(a);
		for(int i=3;i<=(a.length)-1;i--) {
			if(i==-1)
				break;
			System.out.println(a[i]);
			
		}
 	}

}
