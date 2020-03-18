package com.eagle.sys.api;

import com.eagle.boot.EagleRunApplication;
import com.eagle.boot.autoconfigure.EagleApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EagleApplication
@MapperScan("com.eagle.sys.model")
public class EagleSysApiApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		EagleRunApplication.run(EagleSysApiApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EagleSysApiApplication.class);
	}
}
