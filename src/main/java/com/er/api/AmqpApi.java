package com.er.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.er.dto.Message;
import com.er.services.AmqpService;

@RestController
public class AmqpApi {
	
	@Autowired
	AmqpService amqpService;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/send")
	public void sendToConsumer(@RequestBody Message message) {
		amqpService.sendToConsumer(message);
	}
}
