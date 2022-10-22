package team.lyqwc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import team.lyqwc.moudle.pojo.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
  User getByUsername(String username);//dao层和数据库之间通过内置的方法，对数据库进行访问。
  
  User getByUserpassword(String userpassword);
  
  User getByUserID(String userID);
  
  User getByEmail(String email);//通过，user的email实体属性访问数据库的Email属性
  
  User findByUserID(Integer userID);
  
  
  User findByUsername(String username);//通过user的username实体属性查找数据库的username列值
  
  List<User> findByStatus(Integer status);
  
  Page<User> findByStatus(Integer status, Pageable pageable);
  
  
}
