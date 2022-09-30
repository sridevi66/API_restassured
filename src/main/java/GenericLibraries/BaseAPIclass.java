package GenericLibraries;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class BaseAPIclass {
	

	

	
	public DataBaseLibrary dbLib=new DataBaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public restAssuredLibrary rLib=new restAssuredLibrary();
	
	
	@BeforeSuite
	public void bsconfig() throws SQLException
	{
		dbLib.connectToDB();
		Reporter.log("***db connection successful****",true);
		baseURI=IConstantsLibrary.appURL;
		port=IConstantsLibrary.appPort;
		
		
	}
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dbLib.dbclose();
		Reporter.log("*****dbclosed***");
		
	}
	
	
	
	
	
	
	

}
