import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {

  private static final String DRIVER = "org.mariadb.jdbc.Driver";
  private static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
  private static final String USER = "root";
  private static final String PW = "jeon";

  @Test
  public void testDBConnection() throws Exception {
    Class.forName(DRIVER);

    try{
      Connection con = DriverManager.getConnection(URL, USER, PW);
      System.out.println(con);
    } catch(Exception e){
      e.printStackTrace();
    }
  }

}
