package com.er.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.amqp.AmqpProducer;
import com.er.dto.Message;
import com.er.services.AmqpService;

@Service
public class RabbitMQService implements AmqpService{

	@Autowired
	private AmqpProducer<Message> amqp;
	
	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);
	}

}
