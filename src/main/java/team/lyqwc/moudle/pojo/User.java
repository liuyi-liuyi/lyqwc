package team.lyqwc.moudle.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor//提供空参构造
@AllArgsConstructor//提供全参构造
@Data//提供类的get、set、equals、hashCode、toString等方法
@Entity()//声明这个类是一个实体类
@Table(name = "t_user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer userID;//用户编号
    private String username;//用户名
    private String userpassword;//用户密码
    private String email;//用户用于注册的安全邮箱 - 唯一性
    private int status;//用户的等级
}
