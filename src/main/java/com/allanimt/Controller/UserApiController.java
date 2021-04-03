package com.allanimt.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserApiController {

    @GetMapping("/")
    @ResponseBody
    public String ShowHelloWorld() {
        String helloWorldMsg = "Hello world";
        return helloWorldMsg;
    }

}
