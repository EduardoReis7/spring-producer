package com.er.services;

import com.er.dto.Message;

public interface AmqpService {
	void sendToConsumer(Message message);
}
