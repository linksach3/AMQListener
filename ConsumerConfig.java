package com.amazonaws.lambda.amqlistener.service;

public interface ConsumerConfig {
    String getQueueName();
    
       
    String getClientId();

    int getProcessMessagesMax();

    String getWorkerLambdaName();

	String getUrl();
	
	String getTopicName();
}
