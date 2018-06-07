package com.example.demo.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.beans.Employee;

@Component
public class RabbitMQReceiver {
	
	
	@RabbitListener(queues = "javainuse.queue")
    public void processOrder(Employee employee) {
        System.out.println(" Received: "+employee);
    }

}
