package weekend3Assignment;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char [] test1 = test.toCharArray();
		for(int i=0;i<test1.length;i++) {
			if(i%2!=0) {
				test1[i] = Character.toUpperCase(test1[i]);
			}
		}
		System.out.println(test1);

	}

}
