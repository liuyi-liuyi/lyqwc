package team.lyqwc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.lyqwc.moudle.pojo.ResultReturn;
import team.lyqwc.moudle.pojo.Staff;
import team.lyqwc.service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {
  @Autowired
 private  StaffService staffService;
  @PostMapping("stafflogin")
  public ResultReturn stafflogin(String staffname, String staffpassword) {
    //调用service中根据邮箱查找用户的方法
    Staff staff = staffService.loadByStaffName(staffname);//将前端传递过来参数对象的引用赋给user,user就可以调用User里面的get和set方法
    //判断该user是否为null
    if (null == staff) {
      //return是用来结束整个方法的.下面的代码将不会执行.
      return new ResultReturn("404", "sorry,您输入的用户不存在!请注册一个用户!" + staffname);
    }
    String pass = staff.getStaffpassword();
    if (null == pass) {
      return new ResultReturn("500", "sorry,请先输入密码!");
    }
    if (pass.equals(staffpassword)) {//如果数据库中的该用户名所对应的密码输入与数据库中该用户对应的密码相一致，则登录成功
      //为了将登录成功之后的用户名能够在各个页面中进行展示.
      //因此需要将这个用户名直接返回出去.
      return new ResultReturn("200", "登录成功!", staff.getStaffname());
    }
    return new ResultReturn("5xx", "登录失败,密码或用户名错误,请重新输入!", "/dev/staff/stafflogin/stafflogin.html");
  }
  
}

