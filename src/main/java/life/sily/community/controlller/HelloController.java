package life.sily.community.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <Description> <br>
 *
 * @author wein <br>
 * @date 2021/08/01 <br>
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
