package com.er.amqp;

public interface AmqpProducer<T> {
	
	void producer(T t);
}
