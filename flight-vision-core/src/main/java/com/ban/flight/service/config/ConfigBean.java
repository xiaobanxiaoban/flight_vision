package com.ban.flight.service.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by xiaoban on 2017/3/22.
 */
@Configuration
@ComponentScan(basePackages = "com.ban")
@EnableMongoRepositories(basePackages = "com.ban.flight.service.repository")
public class ConfigBean {

	@Bean
	public MapperFacade getMapper() {
		DefaultMapperFactory mapperFactory = (new DefaultMapperFactory.Builder()).mapNulls(false).build();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper;
	}
}
