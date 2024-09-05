package weekend3Assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] a = text.split(" ");
		for(int i =0; i<a.length; i++ ) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					a[j]="";
				}
			}
		}
		for(String ax:a)
			System.out.println(ax);
	}

}
