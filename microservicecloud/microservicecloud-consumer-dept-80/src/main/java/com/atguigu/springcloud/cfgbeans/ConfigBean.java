package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myRule() {
		return new RetryRule();//设置分规则
	}
}
