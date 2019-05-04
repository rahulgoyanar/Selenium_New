package RestAPI.RestAPI;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Gettest {
	public static void main(String[] args) throws UnirestException {
		
	
	String api="https://jsonplaceholder.typicode.com/todos/1";
		JsonNode body = Unirest.get(api)
        .asJson()
        .getBody();
		System.out.println(body);
}
}