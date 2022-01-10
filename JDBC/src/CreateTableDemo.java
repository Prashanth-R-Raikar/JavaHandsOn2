
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 1. Load a Driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		// 2. Connect to the DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm", "root", "qwerty");

		try {
			String qry = "create table associates (id int primary key, name varchar(30),email varchar(30),mobile int)";
			// 3. create a query or statement
			Statement statement = connection.createStatement();

			// 4. Execute the query or statement

			statement.execute(qry);

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}

}