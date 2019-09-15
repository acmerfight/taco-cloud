package sia.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yaogangqiang
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String  home() {
        return "Home";
    }
}
