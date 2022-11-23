package com.kreativsoft.awslambdaspringcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class AwsLambdaSpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaSpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> countCharactors() {
		return value -> String.valueOf(value.length());
	}
	@Bean
	public Function<String, String> toUppercase(){
		return value -> value.toUpperCase();
	}
}
