package kr.co.happyict.hcms.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import kr.co.happyict.hcms.dto.HCMSDto;
import kr.co.happyict.hcms.service.HCMSService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  final
  HCMSService hcmsService;

  public HelloController(HCMSService hcmsService) {
    this.hcmsService = hcmsService;
  }

  @GetMapping({"/", "/index"})
  public String index() {
    return "index";
  }

  @GetMapping("/page")
  public String findPage(@RequestParam("pageNum") int pageNum, Model model) {
    PageHelper.startPage(pageNum, 10);
    Page<HCMSDto> dto = (Page<HCMSDto>) hcmsService.getList();
    model.addAttribute("list", dto);
    return "page";
  }

}
