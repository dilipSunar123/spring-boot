package com.email.send.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Random;

@SpringBootApplication
public class SendEmailApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		Random random = new Random(100000);

		senderService.sendEmail("vicky2520330@gmail.com", "Congrulations", "Hey Vicky, \nWe're glad to let you know you have won nothing. \n\n\nBetter luck next time!\n\nRandom number generated : " + random);
	}
}
