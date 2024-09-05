package weekend3Assignment;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest("Raja");
		api.sendRequest("Raja ", "Rajesh ", false);
	}

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint+requestBody+requestStatus);
	}

}
