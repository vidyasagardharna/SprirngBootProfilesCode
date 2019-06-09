package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dml")
public class DmlNotificationServiceImp implements INotificationService {

	
	public void notificate() {
	System.out.println("from Dml profile");

	}

}
