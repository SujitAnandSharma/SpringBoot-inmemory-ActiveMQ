package com.quppler.activemqinmemoryexample.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class JMSConfig {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("simpleJmsInmemory.queue");
	}
}
