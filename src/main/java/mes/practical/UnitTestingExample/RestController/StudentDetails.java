package mes.practical.UnitTestingExample.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mes.practical.UnitTestingExample.DTO.StudentDTO;
import mes.practical.UnitTestingExample.Entity.Student;
import mes.practical.UnitTestingExample.Repository.StudentRepo;

@RestController
@RequestMapping("/api/student")
public class StudentDetails {
    @Autowired
    StudentRepo repo;
    @PostMapping("/create")
    public List<Student> create(@RequestBody StudentDTO request) {
        System.out.println(request);
        Student student = new Student();
        student.setClassy(request.getClassy());
        student.setName(request.getName());
        student.setRollno(request.getRollno());
        student.setClassy(request.getClassy());
        student.setDivision(request.getDiv());
        student.setPhone(request.getPhone());
        student.setEmail(request.getEmail());
        repo.save(student);
        return repo.findAll();
    }

}
