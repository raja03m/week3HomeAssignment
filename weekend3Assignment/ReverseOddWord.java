package weekend3Assignment;

import java.util.Collections;

public class ReverseOddWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] tesst = test.split(" ");
		for(int i=0; i<tesst.length; i++) {
			if(i%2!=0) {
				tesst[i] = new StringBuilder(tesst[i]).reverse().toString();
				System.out.println(tesst[i]);
			}
			else {
				System.out.println(tesst[i]);
			}
		}
		
	}	
}