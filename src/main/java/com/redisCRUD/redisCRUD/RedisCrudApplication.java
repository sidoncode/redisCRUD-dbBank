package com.redisCRUD.redisCRUD;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.embedded.RedisServer;

@SpringBootApplication
public class RedisCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisCrudApplication.class, args);
	}
	private RedisServer redisServer;



}
