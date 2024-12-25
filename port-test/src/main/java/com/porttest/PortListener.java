package com.porttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private ApplicationContext apc;


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		String property = apc.getEnvironment().getProperty("local.serevr.port");
		System.out.println("Running on : "+Integer.parseInt(property));
	}

}
