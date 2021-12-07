package kr.co.happyict.hcms.mapper;

import java.util.List;
import kr.co.happyict.hcms.dto.HCMSDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HCMSMapper {

  @Select("select * from board")
  List<HCMSDto> getList();

  @Select("select now()")
  String getTime();

}
