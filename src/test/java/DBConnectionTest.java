import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;


@ExtendWith(SpringExtension.class)
@WebAppConfiguration
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

  @Autowired
  private SqlSessionFactory factory;

  @Test
  public void testFactory() {
    System.out.println("SqlFactory : " + factory);
  }

  @Test
  public void testDBConnectionWithConfig() {
    try(SqlSession session = factory.openSession()){
      System.out.println("[ Test DB connection config ] " + session);
    } catch (NullPointerException e) {
      System.out.println("NullPointerException : 객체 주입을 확인해주세요.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
