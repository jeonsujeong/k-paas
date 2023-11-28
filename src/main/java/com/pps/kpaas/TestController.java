package com.pps.kpaas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kpaas")
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "hi~~";
	}
}
