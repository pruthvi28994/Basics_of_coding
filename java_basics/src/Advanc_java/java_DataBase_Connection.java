package Advanc_java;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class java_DataBase_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the connection
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=null;
		int Student_Id=3;
		String Student_Name="Bhavani S";
		//sql insert statement
		
		System.out.println("Lets try to connect to the database and try to insert single element");
		String sql="insert into student_details(Student_Id,Student_Name)"+"values("+Student_Id+",'"+Student_Name+"')";
		
		//lets connect to the data base by making use DriverManager.getConnection(url,username,password)
		try {
			conn=DriverManager.getConnection(url,"java_tutorial","Pruthvi94@");
			
			//create statement object
			Statement st=conn.createStatement();
			
			//execute the sql statement
			int m=st.executeUpdate(sql);
			if(m==1)
				System.out.println("Inserted succesfully :"+sql);
			else 
				System.out.println("Insertion failed");
			System.out.println("Connected to Data base successfully");	
		}
		
		catch(Exception e) {
			System.out.println("Error Throwned :"+e);
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}