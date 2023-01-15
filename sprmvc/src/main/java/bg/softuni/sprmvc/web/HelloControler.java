package bg.softuni.sprmvc.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControler {

    @GetMapping("/hello")
    public ModelAndView hello(ModelAndView modelAndView){

        modelAndView.addObject("num", 6);
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }
}
