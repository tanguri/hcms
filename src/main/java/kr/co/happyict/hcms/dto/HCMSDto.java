package kr.co.happyict.hcms.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HCMSDto {

  private int no;
  private String title;
  private String content;
  private String writer;
  private Date regdate;


}
