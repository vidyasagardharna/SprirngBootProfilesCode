package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("htc")
public class HtcNotificatioServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("From htc profile");

	}

}
