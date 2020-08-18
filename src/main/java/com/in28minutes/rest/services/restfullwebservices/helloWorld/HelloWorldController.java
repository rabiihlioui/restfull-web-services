package com.in28minutes.rest.services.restfullwebservices.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET, path="/helloWorld")
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello World !!!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("some error has happened! Contact Support");
		return new HelloWorldBean("Hello World Rabii");
	}
	
	///hello-world/path-variable/in28minutes
	@GetMapping(path="hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanWithParam(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
}
