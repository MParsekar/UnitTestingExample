package mes.practical.UnitTestingExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index2";
    }
    @GetMapping("/createStudent")
    public String createStudent() {
        return "createStudent";
    }
}
