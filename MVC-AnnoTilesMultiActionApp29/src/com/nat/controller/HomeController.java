    package com.nat.controller;  
      
    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  
      
    @Controller  
    public class HomeController {  
      
        @RequestMapping("/demo")  
        public ModelAndView hello() {  
            return new ModelAndView("page1", "message", "Body Content goes Here !");  
        }  
        
        @RequestMapping("/link1")  
        public ModelAndView register() {  
            return new ModelAndView("page2", "message", "Registration page");  
        }
        
        @RequestMapping("/link2")  
        public ModelAndView login() {  
            return new ModelAndView("page3", "message", "Login Page");  
        }
        
        @RequestMapping("/link3")  
        public ModelAndView reset() {  
            return new ModelAndView("page4", "message", "Login Page");  
        }
        
    }  
    