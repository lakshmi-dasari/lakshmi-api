package io.lakshmi.spring.api.lakshmi_api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String SayHi() {
		return "hi lakshmi";
		
	}
	
	
}
