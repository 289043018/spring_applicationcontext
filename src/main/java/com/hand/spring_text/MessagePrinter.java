package com.hand.spring_text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {
	final private MessageServive service;
	
    public MessagePrinter(MessageServive service) {
        this.service = service;
    }
	@Autowired
    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
