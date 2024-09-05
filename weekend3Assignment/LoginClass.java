package weekend3Assignment;

public class LoginClass extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginClass lc = new LoginClass();
		lc.findElement();
		lc.clickElement();
		lc.enterText();
		lc.performCommonTask();
	}
	
	@Override
	public void performCommonTask() {
		System.out.println("performCommonTask");
	}

}
