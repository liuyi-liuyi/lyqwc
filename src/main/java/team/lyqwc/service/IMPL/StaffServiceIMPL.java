package team.lyqwc.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import team.lyqwc.dao.StaffDao;
import team.lyqwc.moudle.pojo.Staff;
import team.lyqwc.service.StaffService;

import java.util.List;

public class StaffServiceIMPL implements StaffService {
  @Autowired
  private StaffDao staffDao;
  @Override
  public Staff loadByStaffName(String staffname) {
    return staffDao.getByStaffname(staffname);
  }
  
  @Override
  public Staff loadBystaffPassword(String staffpassword) {
    return staffDao.getByStaffpassword(staffpassword);
  }
}
