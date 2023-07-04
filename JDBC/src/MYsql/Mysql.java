package MYsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {
	String url="jdbc:mysql://localhost:3306/test";
			String un="root";
			String pwd="root";
			//create a connection btwn db and java
			
			Connection con=DriverManager.getConnection(url,un,pwd);
	//create a statement to exicute
			
	Statement stmt=con.createStatement();
	//to specify the query
	
	ResultSet res=stmt.executeQuery("select * from Data");
	//used to fetch the data
	
	while(res.next())
	{
		String un1 = res.getString(1);
		String pwd1 = res.getString(2);
		System.out.println(un1+""+pwd1);
	}
}

