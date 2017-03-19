package com.wanbao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.wanbao.mapper")
public class BootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStarterApplication.class, args);
	}

    @RequestMapping("/")
    String home() {
        return "redirect:countries";
    }
}
