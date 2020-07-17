package com.cos.blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControlloer {
	
	@GetMapping({"","/"})
	public String TestIndex() {
		return "index";
	}
}