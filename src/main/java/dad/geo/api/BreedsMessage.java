package dad.geo.api;
import java.util.HashMap;
import java.util.Map;

import dad.geo.model.All;
public class BreedsMessage {
	private Map<String, All> message = new HashMap<String, All>();
	private String status;

	public Map<String, All> getMessage() {
		return message;
	}

	public void setMessage(Map<String, All> message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
