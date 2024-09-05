package weekend3Assignment;

public class JavaClass implements DataConnection{

	public static void main(String[] args) {
		JavaClass obj = new JavaClass();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
	}

}
