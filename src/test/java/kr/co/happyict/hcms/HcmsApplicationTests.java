package kr.co.happyict.hcms;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.util.List;
import kr.co.happyict.hcms.dto.HCMSDto;
import kr.co.happyict.hcms.mapper.HCMSMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HcmsApplicationTests {

  @Autowired
  HCMSMapper mapper;

  @Test
  void contextLoads() {
  }
  @Test
  public void getTime() {
    System.out.println(mapper.getTime());
  }

  @Test
  public void getList() {
    List<HCMSDto> list = mapper.getList();
    for (HCMSDto dto : list) {
      System.out.println(dto);
    }
  }

  @Test
  public void testPage() {
    int perPage = 10;
    PageHelper.startPage(4, perPage);
    Page<HCMSDto> dto = (Page<HCMSDto>) mapper.getList();
    System.out.println(dto);

  }

}
