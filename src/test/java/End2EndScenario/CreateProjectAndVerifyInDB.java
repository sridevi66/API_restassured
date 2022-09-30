package End2EndScenario;

import GenericLibraries.BaseAPIclass;
import GenericLibraries.EndpointsLibrary;
import POJOLibraries.projectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateProjectAndVerifyInDB extends BaseAPIclass{
	
@Test

public void createProject() throws SQLException
{
	//step 1: ceate pre-requisite
	
	projectLibrary pLib=new projectLibrary("sri","sdet3"+jLib.random1(),"created",12);
	
	//step2:send the post request
	
Response resp = given()
	  .body(pLib)
	  .contentType(ContentType.JSON)
	  .when()
	  .post(EndpointsLibrary.createProject);

//step3: capture the projectId

String expData=rLib.getJsonData(resp,"projectId");
System.out.println(expData);
//step 4: verify the projectId in database

String query="select * from project";
String actData=dbLib.executeQueryandreturnData(query,1,expData);
Assert.assertEquals(actData,expData);


}


	
	

}
