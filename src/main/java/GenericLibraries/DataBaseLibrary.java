package GenericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseLibrary {
	
	
	Driver driverref;
	Connection con;
	/**
	 * This class contains generic method related to Database
	 * 
	 * 
	 * @author sridevi
	 */

	
	
	/**
	 * This method will establish the connection with database
	 * @throws SQLException 
	 * @throws exception
	 */
	
	public void connectToDB() throws SQLException
	{
		driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection(IConstantsLibrary.dburl,IConstantsLibrary.dbusername,IConstantsLibrary.dbpassword);
		
		
	}
	public void dbclose() throws SQLException
	{
		con.close();
	}
	
	
	/**
	 * This method will execute the query fetch the data and verify the data in database with expdata from the caller
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	
	public String executeQueryandreturnData(String query,int columnIndex,String expData) throws SQLException
	{
		
		ResultSet result=con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actdata=result.getString(columnIndex);
			if(expData.equalsIgnoreCase(actdata))
			{
				flag=true;
				break;
			}
			
		}
		
	if(flag)
	{
		System.out.println("the data is verified");
		return expData;
	}
	else
	{
		System.out.println("the data is not verified");
		return "";
	}
		
	}
	
	
	
	
}
