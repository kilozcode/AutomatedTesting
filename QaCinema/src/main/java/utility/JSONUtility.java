package utility;

import com.google.gson.Gson;

import omdb.Movie;;

public class JSONUtility {
	private Gson gson;
	
	public JSONUtility() {
		this.gson= new Gson();
		
	}
	
	public String getJSONForObject(Object obj) {
		return gson.toJson(obj);
		
	}
	public <T> String getObjectForJSON(Movie movie, Class<Movie> class1) {
		return gson.toJson(movie, class1);
	}

	public String getObjectForJSON(String movie, Class<Movie> class1) {

		return gson.toJson(movie, class1);
	}

}