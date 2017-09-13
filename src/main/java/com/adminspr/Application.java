/**
 * Describetion: TODO
 * @Author timothy
 * @Email guozhifeng@163.com
 * @Date created in 23:00 2017/9/13
 */
package com.adminspr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




@Controller
@EnableWebMvc
@SpringBootApplication
@EnableAutoConfiguration(exclude={WebMvcAutoConfiguration.class})
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
        /*@RequestMapping("/")
        String home() {
            return "redirect:countries";
        }*/


    }
