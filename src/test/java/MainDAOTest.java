import com.jeon.board.mian.service.MainService;
import com.jeon.board.notice.dto.NoticeDTO;
import com.jeon.board.notice.service.NoticeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ExtendWith(SpringExtension.class)
public class MainDAOTest {

  @Autowired
  MainService main;

  @Autowired
  NoticeService notice;

  @Test
  public void testNotice(){

    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("start", 0);
    map.put("count", 5);

    List<NoticeDTO> mn = main.noticeList(map);

    for(int i = 0; i < mn.size(); i++)
      System.out.println(mn.get(i).toString());

//    NoticeDTO nc =
  }

}
