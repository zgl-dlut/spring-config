package com.zgl.spring.environment.controller;

import com.zgl.spring.environment.service.HelloService;
import com.zgl.spring.environment.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zgl
 * @date 2019/3/27 下午6:02
 */
@RestController
@RequestMapping("/spring")
public class HelloController {

	@Resource
	private HelloService helloService;

	@Resource
	private RedisService redisService;

	@GetMapping("/hello")
	public String helloSpring(@RequestParam String str) {
		return helloService.helloSpring(str);
	}

	@GetMapping("/redis")
	public void operateRedis(@RequestParam String key,@RequestParam String value){
		redisService.operate(key, value);
	}
}