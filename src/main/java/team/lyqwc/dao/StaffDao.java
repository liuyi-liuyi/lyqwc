package team.lyqwc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.lyqwc.moudle.pojo.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff, Integer> {
  
  Staff getByStaffname(String staffname);
  
  Staff getByStaffpassword(String staffpassword);
  
  Staff findByStaffpassword(String staffpassword);
  
  Staff findByStaffname(String staffname);
  
}
