package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private INotificationService service;

	@Override
	public void run(String... args) throws Exception {
		
		service.notificate();
		

	}

}
