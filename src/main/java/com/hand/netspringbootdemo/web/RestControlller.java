package com.hand.netspringbootdemo.web;

import org.springframework.web.bind.annotation.*;

/**
 * Rest controlller  说明返回的是json格式的数据
 *
 * RequestMapping("/rest")   定义全局访问路径
 */
@RestController  //
@RequestMapping("/rest")
public class RestControlller {

    /**
     * Demo 1 string. 访问地址：http://localhost:8080/rest/demo1  value:无参数
     *
     * @return the string
     */
    @RequestMapping(method = RequestMethod.GET,path = "/demo1")
    public String demo1() {
        return "hello world";
    }

    /**
     * Demo 2 string.  访问地址：http://localhost:8080/rest/demo2/25301  value:作为访问路径的一部分
     *
     * @param name the name
     * @return the string
     */
    @GetMapping(path = "/demo2/{name}")
    public String demo2(@PathVariable String name) {
        return "hello "+name;
    }

    /**
     * Demo 3 string.  访问地址：http://localhost:8080/rest/demo3?name=25301  value:QueryParams
     *
     * @param name the name
     * @return the string
     */
    @GetMapping(path = "/demo3")
    public String demo3(@RequestParam String name) {
        return "hello "+name;
    }

    /**
     * Demo 4 string.  访问地址：http://localhost:8080/rest/demo4  value:body
     *
     * @param name the name
     * @return the string
     */
    @PostMapping(path = "/demo4")
    public String demo4(@RequestBody String name) {
        return "hello "+name;
    }

    /**
     * Demo 5 string.  访问地址：http://localhost:8080/rest/demo5  value:form-data
     *
     * @param name the name
     * @return the string
     */
    @PostMapping(path = "/demo5")
    public String demo5(@RequestParam String name) {
        return "hello "+name;
    }
}
