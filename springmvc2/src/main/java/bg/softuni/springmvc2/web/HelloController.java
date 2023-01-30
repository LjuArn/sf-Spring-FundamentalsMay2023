package bg.softuni.springmvc2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


    @GetMapping("/hello2")
    public ModelAndView hello(ModelAndView modelAndView) {
        modelAndView.addObject("num", 999);
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }
}
