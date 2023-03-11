package mes.practical.UnitTestingExample.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mes.practical.UnitTestingExample.DTO.Student;

@RestController
@RequestMapping("/api/student")
public class StudentDetails {
    @PostMapping("/create")
    public void create(@RequestBody Student request) {
        System.out.println(request);
    }
}
