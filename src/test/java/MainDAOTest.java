import com.jeon.board.domain.dto.MainDTO;
import com.jeon.board.domain.service.MainService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@WebAppConfiguration
@ContextConfiguration(locations = "classpath:mybatis-config.xml")
@ExtendWith(SpringExtension.class)
public class MainDAOTest {


  MainService main;

//  @Autowired
//  NoticeService notice;



  @Test
  public void testNotice(){

    List<MainDTO> list = main.selectMainList();

    for(MainDTO mn : list)
      System.out.println(mn.toString());
//    NoticeDTO nc =
  }

}
