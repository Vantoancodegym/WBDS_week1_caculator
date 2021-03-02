package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/caculator")
public class CaculatorController {
    @GetMapping("")
        public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("home");
        return modelAndView;
        }
        @PostMapping("")
    public ModelAndView caculator(@RequestParam int input1, int input2, String check ){
        int result=0;
        switch (check){
            case "Addition(+)":
                result=input1+input2;
                break;
            case "Subtraction(-)":
                result=input1-input2;
                break;
            case "Multipliction(x)":
                result=input1*input2;
                break;
            case "Division(/)":
                result=input1/input2;
                break;
        }
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("result",result);
        modelAndView.addObject("check",check);
        return modelAndView;

        }
}
