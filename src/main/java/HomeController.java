import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping ("/")
    public String RenderIndex(){
      return "index";
    }

    @GetMapping("/submit")
        public String renderSubmit(){
            return "submit.html";
        }
    }

