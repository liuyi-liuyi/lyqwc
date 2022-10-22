package team.lyqwc.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.lyqwc.moudle.pojo.Staff;

import java.util.List;

@SpringBootTest
class StaffDaoTest {
  @Autowired
  private StaffDao staffDao;
  @Test
  public void testgetByStaffname(){
    Staff staff = staffDao.getByStaffname("20");
    System.out.println(staff);
  }
  @Test
  public  void testFindByStaffname(){
    Staff staff = staffDao.findByStaffname("22");
    System.out.println(staff);
  }
  @Test
  public  void testFindByStaffpassword(){
    Staff staff = staffDao.findByStaffpassword("33");
    System.out.println(staff);
  }
  @Test
  public  void testFindAll(){
    List<Staff> staff = staffDao.findAll();
    System.out.println(staff);
  }
  @Test
  public  void testGetByStaffpassword(){
    Staff staff = staffDao.getByStaffpassword("33");
    System.out.println(staff);
  }
 
}