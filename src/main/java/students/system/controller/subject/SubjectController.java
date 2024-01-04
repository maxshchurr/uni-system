package students.system.controller.subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/subjects")
public class SubjectController {
    @GetMapping
    public String mainPage(){
        return "mainpage";
    }
}
