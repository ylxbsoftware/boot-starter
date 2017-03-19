package com.wanbao.conf;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wanbao on 2017/3/19.
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static**").addResourceLocations("classpath:/static/");
    }
}
