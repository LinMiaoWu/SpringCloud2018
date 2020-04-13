package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		//return new RandomRule();//自定义分配规则
		//return new RoundRobinRule();
		
		return new RandomRule_ZY();//自定义分配方法，每台5次
	}
}
