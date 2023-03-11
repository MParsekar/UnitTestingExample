package mes.practical.UnitTestingExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mes.practical.UnitTestingExample.Entity.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
