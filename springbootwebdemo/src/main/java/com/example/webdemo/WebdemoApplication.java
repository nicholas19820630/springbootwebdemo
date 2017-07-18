package com.example.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		/*
		 SpringApplication 则是用于从main方法启动Spring应用的类。默认，它会执行以下步骤：
创建一个合适的ApplicationContext实例 （取决于classpath）。
注册一个CommandLinePropertySource，以便将命令行参数作为Spring properties。
刷新application context，加载所有单例beans。
激活所有CommandLineRunner beans。
默认，直接使用SpringApplication 的静态方法run()即可。但也可以创建实例，并自行配置需要的设置。
		 * */
		SpringApplication.run(WebdemoApplication.class, args);
		
		System.out.println("main sprintboot start success.");
	}
}
