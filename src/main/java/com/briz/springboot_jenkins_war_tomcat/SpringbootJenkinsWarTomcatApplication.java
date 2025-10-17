package com.briz.springboot_jenkins_war_tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootJenkinsWarTomcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsWarTomcatApplication.class, args);
	}
	@RequestMapping("/war")
	public String test()
	{
		return "this is war test";
	}
	@RequestMapping("/end")
	public String end()
	{
		return "end point";
	}

}
