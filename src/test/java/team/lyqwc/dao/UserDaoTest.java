package team.lyqwc.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.lyqwc.moudle.pojo.User;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserDaoTest {
  @Autowired
  private UserDao userDao;
  
  @Test
  void getByUsername() {
    User user = userDao.getByUsername("1");
    System.out.println(user);
  }
  
  @Test
  void getByUserpassword() {
    User user = userDao.getByUserpassword("2");
    System.out.println(user);
  }
  
  @Test
  void getByEmail() {
    User user = userDao.getByEmail("3");
    System.out.println(user);
  }
}