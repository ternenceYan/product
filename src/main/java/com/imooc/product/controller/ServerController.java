package com.imooc.product.controller;

import com.imooc.product.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ServerController {

    private final static Logger log = LoggerFactory.getLogger(ServerController.class);


    @RequestMapping("/msg")
    public String msg() {
        return "this is product msg.";
    }

    /**@RequestParam:
     * 适用于get方式提交，不适用于post方式提交。若"Content-Type"="application/x-www-form-urlencoded",可用post提交
     * 当请求参数name不存在时会有异常发生,可以通过设置属性required=false
     * @param id
     * @param name
     * @return
     */
    @RequestMapping("/msg1")
    public String msg1(@RequestParam("id") String id,@RequestParam(value = "name",required = false) String name) {
        log.info("id:"+id+" name:"+name);
        log.info("通过@RequestParam来接收参数");
        return "id:"+id+"name:"+name+ "this is product msg";
    }

    /**
     * 通过HttpServletRequest接收，post方式和get方式
     * @param request
     * @return
     */
    @RequestMapping(value = "/msg2")
    public String msg2(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        log.info("id:"+id+" name:"+name);
        log.info("通过HttpServletRequest的方式接收参数 post Get 都可以。。。。");
        return "id:"+id+"name:"+name+ "this is product msg";
    }

    /**
     * 通过一个bean来接收,post方式和get方式
     * @return
     */
    @RequestMapping(value = "/msg3")
    public String msg3(@RequestBody User user) {
        String id = user.getId();
        String name = user.getName();
        log.info("id:"+id+" name:"+name);
        log.info("通过一个bean来接收,post方式和get方式");
        return "id:"+id+"name:"+name+ "this is product msg";
    }

    /**
     * 使用@ModelAttribute注解获取POST请求的FORM表单数据
     * @param user
     * @return
     */
    @RequestMapping(value = "/msg4")
    public String msg4(@ModelAttribute("user") User user) {
        String id = user.getId();
        String name = user.getName();
        log.info("id:"+id+" name:"+name);
        log.info("使用@ModelAttribute注解获取POST请求的FORM表单数据");
        return "id:"+id+"name:"+name+ "this is product msg";
    }
}
