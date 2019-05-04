package RestAPI.RestAPI;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class deleteApi {

	public static void main(String[] args) throws UnirestException {
		String editApi = "https://jsonplaceholder.typicode.com/todos/{id}";

		Unirest.delete(editApi)
		        .routeParam("id", "1")
		        .asJson();
		System.out.println("done");

	}

}
