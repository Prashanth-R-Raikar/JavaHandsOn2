
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Associates ID : ");
		int id = scanner.nextInt();				

		Connection connection=null;
		PreparedStatement pStatement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm", "root", "qwerty");

			String qry = "delete from associates where id=?";			
			pStatement = connection.prepareStatement(qry);
			pStatement.setInt(1, id);			

			int a = pStatement.executeUpdate();
			if(a>0) {
				System.out.println(a+" Records Deleted....");
			}else {
				System.out.println("Records Not Deleted....");
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			pStatement.close();
			connection.close();
		}
	}

}