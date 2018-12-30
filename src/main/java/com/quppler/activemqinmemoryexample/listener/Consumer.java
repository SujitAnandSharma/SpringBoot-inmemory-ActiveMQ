package com.quppler.activemqinmemoryexample.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination= "simpleJmsInmemory.queue")
	public void listener(String message){
		System.out.println("Received Message:" +message);
	}

}
