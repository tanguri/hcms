package kr.co.happyict.hcms.service;

import java.util.List;
import kr.co.happyict.hcms.dto.HCMSDto;
import kr.co.happyict.hcms.mapper.HCMSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HCMSService {

  final
  HCMSMapper hcmsMapper;

  public HCMSService(HCMSMapper hcmsMapper) {
    this.hcmsMapper = hcmsMapper;
  }

  public List<HCMSDto> getList() {
    return hcmsMapper.getList();
  }


}
