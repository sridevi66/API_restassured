package GenericLibraries;

import io.restassured.response.Response;

public class restAssuredLibrary {
	

	
	/**
	 * This method will fetch the data based on jsonpath
	 */
	
	
	
	public String getJsonData(Response response,String path)
	{
		

	String jsonData=response.jsonPath().get(path);
	return jsonData;
	}
}