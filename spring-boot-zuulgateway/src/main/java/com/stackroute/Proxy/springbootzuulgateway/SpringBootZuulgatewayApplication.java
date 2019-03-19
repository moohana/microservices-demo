package com.stackroute.Proxy.springbootzuulgateway;

import com.stackroute.Proxy.filters.ErrorFilter;
import com.stackroute.Proxy.filters.PostFilter;
import com.stackroute.Proxy.filters.PreFilter;
import com.stackroute.Proxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class SpringBootZuulgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatewayApplication.class, args);
	}


	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
