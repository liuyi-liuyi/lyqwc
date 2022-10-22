package team.lyqwc.service;

import org.springframework.stereotype.Component;
import team.lyqwc.moudle.pojo.Staff;

import javax.transaction.Transactional;

@Component
public interface StaffService {
  
  Staff loadByStaffName(String staffname);
  
  Staff loadBystaffPassword(String staffpassword);
  
  
}
