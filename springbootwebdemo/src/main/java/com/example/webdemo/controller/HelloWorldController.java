package com.example.webdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdemo.domain.Person;

//@RestController的意思就是controller里面的方法都以json格式输出
@RestController
@EnableAutoConfiguration //用于自动配置。简单的说，它会根据你的pom配置（实际上应该是根据具体的依赖）来判断这是一个什么应用，并创建相应的环境。
public class HelloWorldController 
{
	protected static Logger logger=LoggerFactory.getLogger(HelloWorldController.class);  
	
    @RequestMapping("/hellohaha")
    public String index() 
    {
    	logger.debug("访问hello"); 
    	logger.debug("hello debug logger for hellhaha");
        return "Hello World my springboot 123 hellohaha";
    }
    
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) 
    {
        return "Hello "+myName+"!!!";  
    }  
    
    @RequestMapping("/getmyperson")
    public Person getPerson()
    {
    	Person person1 = new Person();
    	person1.setId(1);
    	person1.setName("sss");
    	person1.setAge(12);
    	
    	return person1;
    }
}
