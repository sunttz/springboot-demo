package com.stt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by taotaosun on 2017/4/26.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/a")
    public String hello(@RequestParam(value = "name",required = false,defaultValue = "world") String name, Model model){
        logger.info(name);
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/b/{name}")
    @ResponseBody
    public String hi(@PathVariable(value = "name") String name) {
        return "hi" + name;
    }

}
