package com.dfl.cyanbird.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@ComponentScan("com.dfl.cyanbird")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
////        converters.add(new MappingJackson2HttpMessageConverter());
//    }
}
