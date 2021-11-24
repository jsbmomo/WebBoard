import com.jeon.board.reply.dto.ReplyDTO;
import com.jeon.board.reply.service.ReplyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@ContextConfiguration(locations = "classpath:WEB-INF/spring/servlet/mybatis-config.xml")
@ExtendWith(SpringExtension.class)
public class MainDAOTest {

  @Autowired
  private ReplyService service;

//  @Test
//  public void testNotice(){
//
//    List<MainDTO> list = main.selectMainList();
//
//    for(MainDTO mn : list)
//      System.out.println(mn.toString());
////    NoticeDTO nc =
//  }
  @Test
  void testReply() {
    ReplyDTO dto = new ReplyDTO();
    dto.setId("admin");
    dto.setWriter("관리자");
    dto.setContentNumber(7);
    dto.setComment("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
    dto.setSecret('N');

    service.insertReply(dto);
//    if (service.insertReply(dto) == 1) {
//      System.out.println("insert 성공");
//    } else {
//      System.out.println("insert 실패");
//    }

  }

}
