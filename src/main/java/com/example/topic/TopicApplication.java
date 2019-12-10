package com.example.topic;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.topic.mapper")
public class TopicApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicApplication.class, args);
	}

}
