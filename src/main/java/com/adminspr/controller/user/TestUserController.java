package com.adminspr.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysuser")
public class TestUserController {
    private static final Logger logger = LoggerFactory.getLogger(TestUserController.class);
    @RequestMapping("/test")
    public  String    test(){
         System.out.println("helloguozhifeng");
         return  "chenggong";
     }

}
