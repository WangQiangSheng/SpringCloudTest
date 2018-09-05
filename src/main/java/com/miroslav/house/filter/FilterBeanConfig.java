package com.miroslav.house.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterRegistration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.miroslav.house.filter.LogFilter;

@Configuration
public class FilterBeanConfig {

	/**
	 * 1、构造 filter
	 * 2、配置拦截 urlPattern
	 * 3、利用 FilterRegistrationBean 进行包装
	 * @return
	 */
	@Bean
	public FilterRegistrationBean logFilter (){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new LogFilter());
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("*");
		filterRegistrationBean.setUrlPatterns(urlPatterns);
		return filterRegistrationBean;
	}
	
}
