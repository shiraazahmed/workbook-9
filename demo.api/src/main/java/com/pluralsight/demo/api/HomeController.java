package com.pluralsight.demo.api;

import org.springframework.web.bind.annotation.*;

@RestController
    public class HomeController {

        @RequestMapping(path = "/", method = RequestMethod.GET)
        public String index(@RequestParam(defaultValue = "Shiraaz") String name){
            return "Hello " + name;
        }
    }

