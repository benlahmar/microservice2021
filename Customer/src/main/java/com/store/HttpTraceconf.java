package com.store;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpTraceconf {

	@Bean
	public HttpTraceRepository httpTraceRepository()
	{
		return new InMemoryHttpTraceRepository();
	}
}
