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
@Entity//声明这个类是一个实体类
@Table(name = "t_staff")

public class Staff implements Serializable {
    @Id
    @GeneratedValue//为一个实体生成一个唯一标识的主键,默认采用JPA默认的生成策略就是GenerationType.AUTO
    private Integer staffID;//员工id
    private String staffname;//员工的姓名
    private String staffpassword;//员工的密码
    
}
