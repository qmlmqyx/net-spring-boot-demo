package com.hand.netspringbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The type Freemarker controller.
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {

    /**
     * Demo 1 string.
     *
     * @param model   the model
     * @param content the content
     * @return the string
     */
    @RequestMapping("/demo01.html")
    public  String demo1(Model model,@RequestParam  String content){
        model.addAttribute("content",content);
        return  "demo01";
    }
}
