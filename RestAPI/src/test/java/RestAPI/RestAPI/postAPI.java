package RestAPI.RestAPI;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class postAPI {

	public static void main(String[] args) throws UnirestException {
		JtwigTemplate template = JtwigTemplate.classpathTemplate("F:/selenium/RestAPI/src/test/java/RestAPI/RestAPI/post.json");
		JtwigModel model = JtwigModel.newModel()
		                            .with("userId", "20")
		                            .with("id", "99");

		template.render(model); //gives the json in the above format by replacing the template expressions
		String postApi = "https://localhost:4200/api/contacts";

		Unirest.post(postApi)
		        .header("accept", "application/json")
		        .header("Content-Type", "application/json")
		        .body(template.render(model))
		        .asJson();
	}

}
